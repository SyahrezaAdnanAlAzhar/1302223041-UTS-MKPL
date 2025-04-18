package lib;

import java.util.ArrayList;

public class FamilyInformation{
    private String spouseName;
	private String spouseIdNumber;
	private List<String> childNames;
	private List<String> childIdNumbers;

    public FamilyInformation(String spouseName, String spouseIdNumber){
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;

        this.childNames = new ArrayList<>();
        this.childIdNumbers = new ArrayList<>();
    }

    public String getSpouseName(){
        return this.spouseName;
    }

    public String getSpouseIdNumber(){
        return this.spouseIdNumber;
    }

    public void setSpouse(String spouseName, String spouseIdNumber){
        this.spouseName = spouseName
        this.spouseIdNumber = spouseIdNumber
    }

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
}