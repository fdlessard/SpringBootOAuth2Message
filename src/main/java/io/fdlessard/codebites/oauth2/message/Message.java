package io.fdlessard.codebites.oauth2.message;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message implements Serializable {
    private String message;
}
