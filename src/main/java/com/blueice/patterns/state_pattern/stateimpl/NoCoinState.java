package com.blueice.patterns.state_pattern.stateimpl;

import com.blueice.patterns.state_pattern.MachineState;
import com.blueice.patterns.state_pattern.Machineable;

/**
* @Description: TODO
* @author blueice
* @date 2018年11月15日 下午3:51:51
*
*/
public class NoCoinState extends MachineState
{
    public NoCoinState(Machineable machine)
    {
        super(machine);
    }

    @Override
    public void addOneCoin()
    {
        if(super.addCoinable()){
            System.out.println("投入了一个硬币！");
            setCurState(new HasCoinState(getMachine()));
        }else{
            throw new UnsupportedOperationException("该状态下不能投币！请检查机器糖果数目");
        }
    }

    @Override
    public String toString()
    {
        return "NoCoinState";
    }
}
