package uk.bl.odin.orcid.client.constants;

/**
 * Models the various Auth scopes
 *
 * @See http://members.orcid.org/api/orcid-scopes
 *
 * @author tom
 *
 */
public enum OrcidAuthScope {

    AUTHENTICATE("/authenticate"),
    
    /**
     * Read Entire Record
     */
    READ_PROFILE("/read-limited"),
    /**
     * Members are encouraged to use READ_PROFILE
     */
    READ_BIO("/read-limited"),
    /**
     * Members are encouraged to use READ_PROFILE
     */
    READ_WORKS("/read-limited"),
    READ_PUBLIC("/read-public"),
    
    CREATE_WORKS("/activities/create"),
    CREATE_EXTERNAL_ID("/person/update"),
    CREATE_AFFILIATIONS("/activities/update"),
    CREATE_FUNDING("/activities/update"),
    
    /**
     * Create and update works, funding, and affiliations
     */
    UPDATE_ACTIVITIES("/activities/update"),

    UPDATE_BIO("/person/update"),
    UPDATE_WORKS("/activities/update"),
    UPDATE_AFFILIATIONS("/affiliations/update"),
    UPDATE_FUNDING("/activities/update"),
    
    /**
     * Replaced with READ_PUBLIC
     *
     * @deprecated
     */
    @Deprecated
    READPUBLIC("/read-public"),
    
    /**
     * 
     * @deprecated
     */
    @Deprecated
    CREATE_PROFILE("/orcid-profile/create");
    
    //affiliation schema is 2.0!
    //affiliation schema is 1.2! //see http://support.orcid.org/knowledgebase/articles/269377-tutorial-add-affiliations-with-curl
    //CREATE_AFFILIATION("/affiliations/create");

    private final String stringValue;

    private OrcidAuthScope(final String s) {
        stringValue = s;
    }

    public String toString() {
        return stringValue;
    }
}
