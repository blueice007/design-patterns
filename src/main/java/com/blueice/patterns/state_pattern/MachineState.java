package com.blueice.patterns.state_pattern;


/**
* @Description: TODO
* @author blueice
* @date 2018年11月15日 下午3:32:09
*
*/
public abstract class MachineState implements StateOp
{
    private Machineable machine;
    
    public MachineState(Machineable machine)
    {
        this.machine = machine;
    }

    @Override
    public void addOneCandy()
    {
        machine.addOneCandy();
    }
    
    @Override
    public void addOneCoin()
    {
        throw new UnsupportedOperationException("该状态下不能投币！");
    }
    
    @Override
    public void removeOneCoin()
    {
        throw new UnsupportedOperationException("该状态下不能退币！");
    }

    @Override
    public boolean addCoinable()
    {
        return machine.addCoinable();
    }
    
    @Override
    public void setCurState(MachineState state)
    {
        machine.setCurState(state);
    }
    @Override
    public void clickBottom()
    {
        throw new UnsupportedOperationException("该状态下不能按派发糖果按钮！");
    }

    public Machineable getMachine()
    {
        return machine;
    }
}
