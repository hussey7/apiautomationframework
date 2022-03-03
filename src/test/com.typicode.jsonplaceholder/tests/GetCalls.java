package tests;

import static io.restassured.RestAssured.given;

public class GetCalls {
    public static void getUsers(){
        given().when().get("https://jsonplaceholder.typicode.com/users").then().log()
                .all();

    }

    public static void getUserByUsername(String username){

        given().queryParam("username",username)
                .when().get("https://jsonplaceholder.typicode.com/users").then().log()
                .body();
    }

    public static void getPostsByID(int userID){

        given().queryParam("userID",userID)
                .when().get("https://jsonplaceholder.typicode.com/posts").then().log()
                .body();
    }

    public static void getCommentsByPostId(int postId){

        given().queryParam("postId",postId)
                .when().get("https://jsonplaceholder.typicode.com/comments").then().log()
                .body();
    }
}
