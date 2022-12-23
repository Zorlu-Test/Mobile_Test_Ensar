package com.Mobile_Test.utilities;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class BookKit2ApiUtil {


    public static String getAuthentication(String email, String password) {
        return given()
                .accept(ContentType.JSON)
                .queryParams("email", email)
                .queryParams("password", password)
                .when()

                .get(Environment.BASE_URL + "/sign")

                .then()
                .assertThat().contentType(ContentType.JSON)
                .and().assertThat().statusCode(200)
                .extract().jsonPath().getString("accessToken");

    }

    public static String getTokenByRole(String userTitle) {
        String email;
        String password;
        switch (userTitle) {

            case "teacher":
                email = Environment.TEACHER_EMAIL;
                password = Environment.TEACHER_PASSWORD;
                break;
            case "student-member":
                email = Environment.MEMBER_EMAIL;
                password = Environment.MEMBER_PASSWORD;
                break;

            case "student-leader":
                email = Environment.LEADER_EMAIL;
                password = Environment.LEADER_PASSWORD;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + userTitle);

        }
        return getAuthentication(email, password);
    }

}
