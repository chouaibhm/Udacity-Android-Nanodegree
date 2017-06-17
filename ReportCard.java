public class ReportCard {
    private int mMath;
    private int mAlgorithm;
    private int mGraphs;
    private int mProgramming;
    private int mUML;
    private int mNetwork;
    private String mName;

    public ReportCard(String name , int math , int algorithm ,int graphs , int network , int programming , int uml){
        this.mName=name;
        this.mMath=math;
        this.mAlgorithm=algorithm;
        this.mGraphs=graphs;
        this.mNetwork=network;
        this.mProgramming=programming;
        this.mUML=uml;
    }
    /*set Name */
    public void setName(String name){
        mName=name;
    }
    /*Get Name */
    public String getmName(){
        return mName;
    }
    /*set math */
    public void setmMath(int math){
        mMath=math;
    }
    /*Get Math */
    public int getmMath(){
        return mMath;
    }
    /*set algorithm */
    public void setmAlgorithm(int algorithm){
        mAlgorithm=algorithm;
    }
    /*get algorithm */
    public int getmAlgorithm(){
        return mAlgorithm;
    }
    /*set graphs */
    public void setmGraphs(int graphs){
        mGraphs=graphs;
    }
    /*get graphs */
    public int getmGraphs(){
        return mGraphs;
    }
    /*set network */
    public void setmNetwork(int network){
        mNetwork=network;
    }
    /*Get network */
    public int getmNetwork(){
        return mNetwork;
    }
    /*set programming */
    public void setmProgramming(int programming){
        mProgramming=programming;
    }
    /*Get  programming */
    public int getmProgramming(){
        return mProgramming;
    }
    /*Set  UML */
    public void setmUML(int uml){
        mUML=uml;
    }
    /*Get  UML */
    public int getmUML(){
        return mUML;
    }
    @Override
    public String toString() {
        
        return "Result { " + 
                "Name = "+mName+
                ", Math = " + mMath + 
                ", Algorithm = " + mAlgorithm + 
                ", network = " + mNetwork + 
                ", programming = " + mProgramming + 
                ", UML = " + mUML + 
                " }";
           }
}
