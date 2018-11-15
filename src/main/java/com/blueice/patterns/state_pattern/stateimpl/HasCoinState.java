package com.blueice.patterns.state_pattern.stateimpl;

import com.blueice.patterns.state_pattern.MachineState;
import com.blueice.patterns.state_pattern.Machineable;

/**
* @Description: TODO
* @author blueice
* @date 2018年11月15日 下午3:53:20
*
*/
public class HasCoinState extends MachineState
{
    public HasCoinState(Machineable machine)
    {
        super(machine);
    }

    @Override
    public void removeOneCoin()
    {
        System.out.println("清退了一个硬币，请查收！");
        setCurState(new NoCoinState(getMachine()));
    }

    @Override
    public void clickBottom()
    {
        System.out.println("按下发糖按钮，糖果派发中...");
        getMachine().dispolyOneCandy();
        
    }

    @Override
    public String toString()
    {
        return "HasCoinState";
    }
}
