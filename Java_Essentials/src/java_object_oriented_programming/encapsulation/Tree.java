package java_object_oriented_programming.encapsulation;

import java.awt.*;

public class Tree
{
    //* Atributes or Fields
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;

    protected static Color TRUNK_COLOR;

    public double getHeightFt() {
        return heightFt;
    }

    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }

    public static Color getTrunkColor() {
        return TRUNK_COLOR;
    }

    public static void setTrunkColor(Color trunkColor) {
        TRUNK_COLOR = trunkColor;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType)
    {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public void grow(){
        this.heightFt += 10;
        this.trunkDiameterInches +=1;
    }

    public static void announceTree(){
        System.out.println("Look out for that tree!");
    }
    public void anouceTallTree()
    {
         if(this.heightFt>100)
         {
             System.out.println("That's a tall" + this.treeType + "tree!");
         }
    }
}
