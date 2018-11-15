package com.blueice.patterns.state_pattern;


/**
* @Description: TODO
* @author blueice
* @date 2018年11月15日 下午2:54:51
*
*/
public interface StateOp
{
    void addOneCandy();
    void addOneCoin();
    void removeOneCoin();
    void clickBottom();
    boolean addCoinable();
    void setCurState(MachineState state);
}
