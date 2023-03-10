package com.example.uw_life_simulator.model;

import com.example.uw_life_simulator.data.PlayerAttribute;

public class BuffGenerator {
    public static Buff generateBuff(int buffId)
    {
        switch (buffId)
        {
            case 0: return new BuffNull();
            case 1: return new BuffIQ();
            case 2: return new BuffIQ2();
            case 3: return new BuffLuck3();
            case 4: return new BuffLuck4();

            default: return null;
        }
    }
};

/**
 * NULL buff which does nothing
 **/
class BuffNull extends Buff {
    //Constructor
    public BuffNull(){
        this.description = "This is a null Talent\n";
        this.Id = 0;
    }

    /**
     * Buff's effect on the player
     *
     * Input: UserAttribute : attribute
     * Output: void
     **/
    @Override
    public void visit(PlayerAttribute attribute) {
        //doing nothing
    }
};

/**
 * BuffID: 1
 * Effect: iq+1
 */
class BuffIQ extends Buff {
    //Constructor
    public BuffIQ(){
        this.description = "You figured out a better way for yourself " +
                "to understand the course content\n";
        this.Id = 1;
    }

    /**
     * Buff's effect on the player(iq + 1)
     *
     * Input: UserAttribute : attribute
     * Output: void
     **/
    @Override
    public void visit(PlayerAttribute attribute)
    {
        attribute.IQ ++;
    }
};

/**
 * BuffID: 2
 * Effect: iq-1
 */
class BuffIQ2 extends Buff {
    //Constructor
    public BuffIQ2(){
        this.description = "You figured out a new way for yourself " +
                "to understand the course content, but it seems is not working as good" +
                "as the previous one...\n";
        this.Id = 2;
    }

    /**
     * Buff's effect on the player(iq - 1)
     *
     * Input: UserAttribute : attribute
     * Output: void
     **/
    @Override
    public void visit(PlayerAttribute attribute)
    {
        attribute.IQ --;
    }
};

/**
 * BuffID: 2
 * Effect: iq-1
 */
class BuffLuck3 extends Buff {
    //Constructor
    public BuffLuck3(){
        this.description = "Congratulation, you get a parse from professor!\n";
        this.Id = 3;
    }

    /**
     * Buff's effect on the player(iq - 1)
     *
     * Input: UserAttribute : attribute
     * Output: void
     **/
    @Override
    public void visit(PlayerAttribute attribute)
    {
        attribute.luck ++;
    }
};

/**
 * BuffID: 2
 * Effect: iq-1
 */
class BuffLuck4 extends Buff {
    //Constructor
    public BuffLuck4(){
        this.description = "The crow is flying around your house, it is not a good sign...\n";
        this.Id = 4;
    }

    /**
     * Buff's effect on the player(iq - 1)
     *
     * Input: UserAttribute : attribute
     * Output: void
     **/
    @Override
    public void visit(PlayerAttribute attribute)
    {
        attribute.luck --;
    }
};


