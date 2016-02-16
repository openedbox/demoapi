package demoapi.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Result {
    public static ResponseEntity OK(Object content){
        return new ResponseEntity(content, HttpStatus.OK);
    }
}
