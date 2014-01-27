import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.restlet.representation.Representation;
import org.restlet.resource.Resource;

import uk.bl.odin.orcid.client.OrcidPublicClient;
import uk.bl.odin.orcid.client.constants.OrcidSearchField;
import uk.bl.odin.orcid.schema.messages.onepointone.OrcidProfile;
import uk.bl.odin.orcid.schema.messages.onepointone.OrcidSearchResults;


public class OrcidPublicClientTest {

	@Test
	public final void testFetchProfile() throws IOException, JAXBException {
		OrcidPublicClient client = new OrcidPublicClient();
		
		//No works.
		OrcidProfile bio = client.getOrcidBio("0000-0002-9151-6445");
		assertEquals("Unit",bio.getOrcidBio().getPersonalDetails().getGivenNames());
		assertEquals("Test",bio.getOrcidBio().getPersonalDetails().getFamilyName());
		assertNull(bio.getOrcidActivities().getOrcidWorks());
		assertEquals(bio.getOrcidIdentifier().getPath(),"0000-0002-9151-6445");
	
		//with works
		OrcidProfile pro = client.getOrcidProfile("0000-0002-9151-6445");
		assertEquals("Unit",pro.getOrcidBio().getPersonalDetails().getGivenNames());
		assertEquals("Test",pro.getOrcidBio().getPersonalDetails().getFamilyName());
		assertEquals(pro.getOrcidActivities().getOrcidWorks().getOrcidWork().size(),2);
		assertEquals(pro.getOrcidIdentifier().getPath(),"0000-0002-9151-6445");		
		
	}
	
	@Test
	public final void testSearchForDOI() throws IOException, JAXBException{	
		//THIS IS RETURNING INVALID MESSAGES - they're 1.0.23 (have an <orcid> element) despite being labeled as 1.1
		//I've hacked a fix into the JAXB classes.
		OrcidPublicClient client = new OrcidPublicClient();
		String query = OrcidSearchField.WORK_ID_DOI.buildExactQuery("10.9997/abc123");
		assertEquals("digital-object-ids: \"10.9997/abc123\"",query);
		OrcidSearchResults results = client.search(query);
		assertEquals(1,results.getNumFound().intValue());
		assertEquals(results.getOrcidSearchResult().get(0).getOrcidProfile().getOrcidIdentifier().getPath(),"0000-0002-9151-6445");
	}
	
	@Test
	public final void testSearchForDOIPrefix() throws IOException, JAXBException{	
		OrcidPublicClient client = new OrcidPublicClient();
		String query = OrcidSearchField.WORK_ID_DOI.buildPrefixQuery("10.9998");
		assertEquals("digital-object-ids: 10.9998*",query);
		OrcidSearchResults results = client.search(query);
		assertEquals(1,results.getNumFound().intValue());
		assertEquals(results.getOrcidSearchResult().get(0).getOrcidProfile().getOrcidIdentifier().getPath(),"0000-0002-9151-6445");
	}
	
	//add test for ZERO results!
	/*
	<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
	<orcid-message xmlns="http://www.orcid.org/ns/orcid">
	    <message-version>1.1</message-version>
	</orcid-message>
	*/

	
}
