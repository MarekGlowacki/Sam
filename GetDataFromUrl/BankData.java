package B2BNetwork;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BankData {

    private Integer ID;
    private String Name;
    private String CommercialBankName;
    private String IdentifyingCodes;
    private Integer SortBankCode;
    private String SortCodeName;
    private String AbbreviationBankName;
    private String TownSeatBank;
    private String StreetAndBuildingNumberBank;
    private String PostalCodeBank;
    private String TownPostOfficeBank;
    private String NumberBanksPOUnitBox;
    private String PostalCodePostOfficePOUnixBox;
    private String TelephoneNumberBank;
    private String TelephoneNumberBank2;
    private String FaxNumberBank;
    private String FaxNumberBank2;
    private Date DateSortCodeGeneration;
    private String BICcode;
    private String SEPABICcode;
    private String WebsiteAddressBank;
    private String Province;
    private String Powiat;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCommercialBankName() {
        return CommercialBankName;
    }

    public void setCommercialBankName(String commercialBankName) {
        CommercialBankName = commercialBankName;
    }

    public String getIdentifyingCodes() {
        return IdentifyingCodes;
    }

    public void setIdentifyingCodes(String identifyingCodes) {
        IdentifyingCodes = identifyingCodes;
    }

    public Integer getSortBankCode() {
        return SortBankCode;
    }

    public void setSortBankCode(Integer sortBankCode) {
        SortBankCode = sortBankCode;
    }

    public String getSortCodeName() {
        return SortCodeName;
    }

    public void setSortCodeName(String sortCodeName) {
        SortCodeName = sortCodeName;
    }

    public String getAbbreviationBankName() {
        return AbbreviationBankName;
    }

    public void setAbbreviationBankName(String abbreviationBankName) {
        AbbreviationBankName = abbreviationBankName;
    }

    public String getTownSeatBank() {
        return TownSeatBank;
    }

    public void setTownSeatBank(String townSeatBank) {
        TownSeatBank = townSeatBank;
    }

    public String getStreetAndBuildingNumberBank() {
        return StreetAndBuildingNumberBank;
    }

    public void setStreetAndBuildingNumberBank(String streetAndBuildingNumberBank) {
        StreetAndBuildingNumberBank = streetAndBuildingNumberBank;
    }

    public String getPostalCodeBank() {
        return PostalCodeBank;
    }

    public void setPostalCodeBank(String postalCodeBank) {
        PostalCodeBank = postalCodeBank;
    }

    public String getTownPostOfficeBank() {
        return TownPostOfficeBank;
    }

    public void setTownPostOfficeBank(String townPostOfficeBank) {
        TownPostOfficeBank = townPostOfficeBank;
    }

    public String getNumberBanksPOUnitBox() {
        return NumberBanksPOUnitBox;
    }

    public void setNumberBanksPOUnitBox(String numberBanksPOUnitBox) {
        NumberBanksPOUnitBox = numberBanksPOUnitBox;
    }

    public String getPostalCodePostOfficePOUnixBox() {
        return PostalCodePostOfficePOUnixBox;
    }

    public void setPostalCodePostOfficePOUnixBox(String postalCodePostOfficePOUnixBox) {
        PostalCodePostOfficePOUnixBox = postalCodePostOfficePOUnixBox;
    }

    public String getTelephoneNumberBank() {
        return TelephoneNumberBank;
    }

    public void setTelephoneNumberBank(String telephoneNumberBank) {
        TelephoneNumberBank = telephoneNumberBank;
    }

    public String getTelephoneNumberBank2() {
        return TelephoneNumberBank2;
    }

    public void setTelephoneNumberBank2(String telephoneNumberBank2) {
        TelephoneNumberBank2 = telephoneNumberBank2;
    }

    public String getFaxNumberBank() {
        return FaxNumberBank;
    }

    public void setFaxNumberBank(String faxNumberBank) {
        FaxNumberBank = faxNumberBank;
    }

    public String getFaxNumberBank2() {
        return FaxNumberBank2;
    }

    public void setFaxNumberBank2(String faxNumberBank2) {
        FaxNumberBank2 = faxNumberBank2;
    }

    public Date getDateSortCodeGeneration() {
        return DateSortCodeGeneration;
    }

    public void setDateSortCodeGeneration(Date dateSortCodeGeneration) {
        DateSortCodeGeneration = dateSortCodeGeneration;
    }

    public String getBICcode() {
        return BICcode;
    }

    public void setBICcode(String BICcode) {
        this.BICcode = BICcode;
    }

    public String getSEPABICcode() {
        return SEPABICcode;
    }

    public void setSEPABICcode(String SEPABICcode) {
        this.SEPABICcode = SEPABICcode;
    }

    public String getWebsiteAddressBank() {
        return WebsiteAddressBank;
    }

    public void setWebsiteAddressBank(String websiteAddressBank) {
        WebsiteAddressBank = websiteAddressBank;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getPowiat() {
        return Powiat;
    }

    public void setPowiat(String powiat) {
        Powiat = powiat;
    }

    public List<String> getabbreviationBankNames(){
        List<String> abbreviationBankNames = new ArrayList<>();

        abbreviationBankNames.add("C-la");
        abbreviationBankNames.add("C-inne");
        abbreviationBankNames.add("O/Okr.");
        abbreviationBankNames.add("C.Oper");
        abbreviationBankNames.add("Inne");
        abbreviationBankNames.add("O.");
        abbreviationBankNames.add("C.Roz.");
        abbreviationBankNames.add("B.M.");
        abbreviationBankNames.add("O.Korp");
        abbreviationBankNames.add("F.");

        return abbreviationBankNames;
    }

    public List<String> getAddressPredicates() {
        List<String> addressPredicates = new ArrayList<>();

        addressPredicates.add("ul.");
        addressPredicates.add("pl.");
        addressPredicates.add("Al.");
        addressPredicates.add("al.");
        addressPredicates.add("Aleja");
        addressPredicates.add("plac");
        addressPredicates.add("Rynek");
        addressPredicates.add("5");
        addressPredicates.add("Zakrzewo");
        addressPredicates.add("Zygmunta");
        addressPredicates.add("DĽbrowskiego");
        addressPredicates.add("rynek");
        addressPredicates.add("Aleje");
        addressPredicates.add("Jagie");
        return addressPredicates;
    }

    public List<Integer> countPhoneNumber(){
        List<Integer> countsPhoneNumber = new ArrayList<>();

        countsPhoneNumber.add(1);
        countsPhoneNumber.add(2);
        countsPhoneNumber.add(3);
        return countsPhoneNumber;
    }

}
