package com.example.athahitha;

public class DataClassOrganizations {
    private String dataOrganizationName;
    private String dataAboutOrganization;
    private String dataRequestCatogaries;
    private String dataDescription;

    public String getDataOrganizationName() {
        return dataOrganizationName;
    }

    public String getDataAboutOrganization() {
        return dataAboutOrganization;
    }

    public String getDataRequestCatogaries() {
        return dataRequestCatogaries;
    }

    public String getDataDescription() {
        return dataDescription;
    }

    public DataClassOrganizations(String dataOrganizationName, String dataAboutOrganization, String dataRequestCatogaries, String dataDescription) {
        this.dataOrganizationName = dataOrganizationName;
        this.dataAboutOrganization = dataAboutOrganization;
        this.dataRequestCatogaries = dataRequestCatogaries;
        this.dataDescription = dataDescription;
    }
}
