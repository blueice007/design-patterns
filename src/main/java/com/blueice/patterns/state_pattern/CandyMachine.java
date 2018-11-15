package com.blueice.patterns.state_pattern;

import com.blueice.patterns.state_pattern.stateimpl.HasCoinState;
import com.blueice.patterns.state_pattern.stateimpl.NoCoinState;

/**
* @Description: TODO
* @author blueice
* @date 2018年11月15日 下午2:53:12
*
*/
public class CandyMachine implements Machineable
{
    private static int candyCount=1;
    
    /*private MachineState noCoinState = new NoCoinState(this);
    private MachineState hasCoinState = new HasCoinState(this);
    private MachineState preSoldState = new PreSoldState(this);
    private MachineState failSoldState = new FailSoldState(this);*/
    
    private MachineState curState = new NoCoinState(this);
    @Override
    public void addOneCandy()
    {
        System.out.println("添加糖果库存1个");
        candyCount++;
        showState();
    }

    @Override
    public void addOneCoin()
    {
        curState.addOneCoin();
        showState();
    }

    @Override
    public void removeOneCoin()
    {
        curState.removeOneCoin();
        showState();
    }

    @Override
    public void clickBottom()
    {
        curState.clickBottom();
        showState();
    }
    
    @Override
    public void dispolyOneCandy()
    {
        if(candyCount>0){
            System.out.println("发放一个！");
            setCurState(new NoCoinState(this));
            candyCount--;
        }else{
            System.out.println("糖果数量不足，发放失败！");
            setCurState(new HasCoinState(this));
        }
    }

    @Override
    public boolean addCoinable()
    {
        return candyCount>0?true:false;
    }

    @Override
    public void setCurState(MachineState state)
    {
        curState = state;
    }

    @Override
    public String toString()
    {
        return String.format("糖果机status:%s;数量:%d", curState.toString(),candyCount);
    }
    private void showState(){
        System.out.println(toString());
    }

}
