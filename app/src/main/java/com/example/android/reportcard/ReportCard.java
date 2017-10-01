package com.example.android.reportcard;

public class ReportCard {

    private String mStudentName;
    private int mCurrentYear;
    private int mMathematics;
    private int mPhysics;
    private int mChemistry;
    private int mHistory;
    private int mComputerScience;
    private int mPrinciplesOfEconomicTheory;
    private int mAverageGrade;

    public ReportCard(String studentName, int currentYear, int mathematicsGrade, int physicsGrade, int chemistryGrade, int historyGrade, int computerScienceGrade, int principlesOfEconomicTheoryGrade, int averageGrade) {
        mStudentName = studentName;
        mCurrentYear = currentYear;
        mMathematics = mathematicsGrade;
        mPhysics = physicsGrade;
        mChemistry = chemistryGrade;
        mHistory = historyGrade;
        mComputerScience = computerScienceGrade;
        mPrinciplesOfEconomicTheory = principlesOfEconomicTheoryGrade;
        mAverageGrade = averageGrade;
    }

    public String getStudentName() {
        return mStudentName;
    }

    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    public int getCurrentYear() {
        return mCurrentYear;
    }

    public void setCurrentYear(int currentYear) {
        mCurrentYear = currentYear;
    }

    public int getMathematicsGrade() {
        return mMathematics;
    }

    public void setMathematicsGrade(int mathematicsGrade) {
        mMathematics = mathematicsGrade;
    }

    public int getPhysicsGrade() {
        return mPhysics;
    }

    public void setPhysicsGrade(int physicsGrade) {
        mPhysics = physicsGrade;
    }

    public int getChemistryGrade() {
        return mChemistry;
    }

    public void setChemistryGrade(int chemistryGrade) {
        mChemistry = chemistryGrade;
    }

    public int getHistoryGrade() {
        return mHistory;
    }

    public void setHistoryGrade(int historyGrade) {
        mHistory = historyGrade;
    }

    public int getComputerScienceGrade() {
        return mComputerScience;
    }

    public void setComputerScienceGrade(int computerScienceGrade) {
        mComputerScience = computerScienceGrade;
    }

    public int getPrinciplesOfEconomicTheoryGrade() {
        return mPrinciplesOfEconomicTheory;
    }

    public void setPrinciplesOfEconomicTheory(int principlesOfEconomicTheoryGrade) {
        mPrinciplesOfEconomicTheory = principlesOfEconomicTheoryGrade;
    }

    public int getAverageGrade() {
        mAverageGrade = (mMathematics + mPhysics + mChemistry + mHistory + mComputerScience + mPrinciplesOfEconomicTheory) / 6;
        return mAverageGrade;
    }

    @Override
    public String toString() {
        return "Student's Name: " + mStudentName + "\n" +
                "Current Year: " + mCurrentYear + "\n" +
                "Mathematics: " + mMathematics + "\n" +
                "Physics: " + mPhysics + "\n" +
                "Chemistry: " + mChemistry + "\n" +
                "History: " + mHistory + "\n" +
                "ComputerScience: " + mComputerScience + "\n" +
                "PrinciplesOfEconomicTheory: " + mPrinciplesOfEconomicTheory + "\n" +
                "AverageGrade: " + mAverageGrade;
    }
}
