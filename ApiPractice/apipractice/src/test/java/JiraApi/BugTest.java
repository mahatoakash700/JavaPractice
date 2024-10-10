package JiraApi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BugTest {

    public static void main(String[] args) {
        
        RestAssured.baseURI = "https://akashlandmark001.atlassian.net";

        given().
        header("Content-Type", "application/json").
        header("Authorization", "Basic YWthc2hsYW5kbWFyazAwMUBnbWFpbC5jb206QVRBVFQzeEZmR0YwdWhGcnUyLVdRLTNSdzhBdjlvaVpSbXN3T0l0M05Eamd0czZoMWFsbmtBa3BjVXFiOWlFQ2xEOXhiaDNrVkhTUFp4WGpTSU1TYmlvZVl6NnBIZnZtNGhBTmxzdUt1amstS3QxRWx5Y2pXYWV3aHYxNkR2d1ZoYWFQdVBDa21FQzBYaFIwTXdJbkdocXdYeFBkRUczLVM4cVRmTUI0OEFnTzlubzRIUXhseW1BPUZFOTI5QUVF").
        body("");
    }

}
