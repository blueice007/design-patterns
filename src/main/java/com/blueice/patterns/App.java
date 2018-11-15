package com.blueice.patterns;

import com.blueice.patterns.state_pattern.CandyMachine;
import com.blueice.patterns.state_pattern.StateOp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StateOp machine = new CandyMachine();
        
        machine.addOneCoin();
        machine.removeOneCoin();
        machine.addOneCoin();
        machine.clickBottom();
    }
}
