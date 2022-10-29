//**********************************************************************************************************************
// * Documentation
// * Author: zilin.li
// * Date: 10/22
// * Definition: Implementation of TwitchException class.
// * Note: <Info>
//**********************************************************************************************************************
package com.example.jupiter.service;

//**********************************************************************************************************************
// * Class definition
//**********************************************************************************************************************
public class TwitchException extends RuntimeException {

//**********************************************************************************************************************
// * Class constructors
//**********************************************************************************************************************
    public TwitchException(String errorMessage) {
        super(errorMessage);
    }
}