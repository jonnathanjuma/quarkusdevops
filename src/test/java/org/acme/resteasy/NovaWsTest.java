package org.acme.resteasy;

import static io.restassured.RestAssured.given;

import org.acme.resteasy.model.NovalModel;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
public class NovaWsTest {
	@Test
    public void testHelloEndpoint() {
		NovalModel datos = new NovalModel();
		datos.setMessage("Prueba");
		datos.setFrom("Jonnathan");
		datos.setTimeToLifeSec("10");
		datos.setTo("Juan");
		
        given()
        	.accept(ContentType.JSON)
        	.contentType(ContentType.JSON)
        	.body(datos)
          .when().post("/DevOps")
          .then()
             .statusCode(200);
    }
	

}
