/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;



/**
 *
 * @author FIRSTMentor
 */
public class KnightRiderfx {
    
    Encoder TMencoder;
    Encoder RMencoder;
    void KnightRiderFx(){
        TMencoder = new Encoder(1, 2, true, EncodingType.k2X);
        RMencoder = new Encoder(3, 4, true, EncodingType.k2X);
        TMencoder.start();
        RMencoder.start();
        
        double lDistance = TMencoder.getDistance();
        double rDistance = RMencoder.getDistance();
        
        
        
    }
    
    
    //build driver functions here -Thomas
    
}
