package demoapi.core;

import lombok.Data;
import lombok.experimental.Builder;

@Data
@Builder
public class Result {
    private boolean success = true;
    private String message;
    private Object returnValue;
    private Object times;
}
