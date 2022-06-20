package com.example.uw_life_simulator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player { // Implementation needed
    private String name = "";
    private int programId = 0;
    private int numTerm = 2;

    private BuffManager buffManager = new BuffManager(this);
    private CourseManager courseManager = new CourseManager(this);
    private UserAttribute userAttribute = new UserAttribute();

    //Getter & Setters
    public String getName(){ return name;}
    public void setName(String n){ name = n;}
    public int getProgramId(){ return programId;}
    public void setProgramId(int n){ programId = n;}
    public int getNumTerm(){ return numTerm;}
    public void setNumTerm(int n){ numTerm = n;}
    public BuffManager getTalentManager(){ return buffManager; }
    public UserAttribute getUserAttribute(){ return userAttribute; }
    public CourseManager getCourseManager(){return courseManager; }
    /**
     * Accept GameEvents' impact
     *
     * Input: GameEvent : gameEvent
     * Output: void
     **/
    public void accept(GameEvent gameEvent)
    {
        gameEvent.visit(userAttribute);
    }

    /**
     * Accept talents' impact
     *
     * Input: Talent : talent
     * Output: void
     **/
    public void accept(Buff buff){ buff.visit(userAttribute); }

}
