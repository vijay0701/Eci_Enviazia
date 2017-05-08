package com.utils.Pesection;

import com.utils.Pesection.Jsonreader;

public class Appconfig {
	private static Jsonreader value = new Jsonreader();
    private static String appconfigPath = "\\appConfigPE.json";
    public static final String BROWSER = value.readJsonFile1("browser", "navigator", appconfigPath);
    public static final String BASE_URL = value.readJsonFile1("browser", "urlBase", appconfigPath);
    public static final String CHROMEDRIVER_PATH = value.readJsonFile1("confDriver", "chrome", appconfigPath);
    public static final String IEDRIVER_PATH = value.readJsonFile1("confDriver", "ie", appconfigPath);
    public static final int IMPLICIT_WAIT = Integer.parseInt(value.readJsonFile1("confDriver",
            "implicitWait", appconfigPath));
    public static final int EXPLICIT_WAIT = Integer.parseInt(value.readJsonFile1("confDriver",
            "explicitWait", appconfigPath));
    public static final int WEBDRIVERWAIT_SLEEP = Integer.parseInt(value.readJsonFile1("confDriver",
            "webDriverWait_Sleep", appconfigPath));
    public static final String EXCEL_PATH = value.readJsonFile1("ExternalFile", "excelPath", appconfigPath);
    public static final String EXCEL_DATA_PROVIDER = value.readJsonFile1("ExternalFile", "dataProviderData", appconfigPath);
    public static final String PORTAL_URL = value.readJsonFile1("browser", "urlPortal", appconfigPath);
    /*public static final String EXCEL_PATH = value.readJsonFile1("ExternalFile", "excelPath", appconfigPath);
    public static final String EXCEL_DATA_PROVIDER = value.readJsonFile1("ExternalFile", "dataProviderData", appconfigPath);
    public static final String QA_DB_conn = value.readJsonFile1("DataBaseInformation", "dbConnectionQA", appconfigPath);
    public static final String PORTAL_US_DB_conn = value.readJsonFile1("DataBaseInformation", "dbConnectionPortalUS", appconfigPath);
    public static final String MIN_WAIT = value.readJsonFile("confDriver", "implicitWait", appconfigPath);
    public static final String PORTAL_URL = value.readJsonFile("browser", "urlPortal", appconfigPath);
    public static final String SERVICE_ACCOUNT_EMAIL = value.readJsonFile("serviceAccountInformation", "email", appconfigPath);
    public static final String CERTIFICATE_PATH = value.readJsonFile("serviceAccountInformation", "certificatePath", appconfigPath);
    public static final String APP_NAME = value.readJsonFile("serviceAccountInformation", "applicationName", appconfigPath);
    public static final String CERTIFICATE = value.readJsonFile("serviceAccountInformation", "certificate", appconfigPath);
    public static final String TESTGROUP = value.readJsonFile("testCase", "testGroups", appconfigPath);
    public static final String REPORTPATH = value.readJsonFile("testCase", "outPath", appconfigPath);
    public static final String LOG = value.readJsonFile("testCase", "log", appconfigPath);*/


}
