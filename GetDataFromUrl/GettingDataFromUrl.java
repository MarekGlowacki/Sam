package B2BNetwork;

import java.sql.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GettingDataFromUrl {

    private static final String QUERY1 = "CREATE TABLE FinancialInstitutions (ID INTEGER(5), Name char(140), CommercialBankName char(100), IdentifyingCodes char(50), SortBankCode INTEGER(8), SortCodeName char(140), AbbreviationBankName char(15), TownSeatBank char(30),  StreetAndBuildingNumberBank char(40), PostalCodeBank char(6), TownPostOfficeBank char(30), NumberBanksPOUnitBox char(6), PostalCodePostOfficePOUnixBox char(6), Empty char(12), TelephoneNumberBank char(20), TelephoneNumberBank2 char(20), FaxNumberBank char(20), FaxNumberBank2 char(20), DateSortCodeGeneration date, BICcode char(11), SEPABICcode char(11), WebsiteAddressBank char(50), Province char(22), Powiat char(25), CorrespondenceAddress char(30), CorrespondenceAddressStreetAndBuildingNumber char(40), CorrespondenceAddressPostalCode char(6), CorrespondenceAddressPostOffice char(30), CorrespondenceAddressPostBoxNumber char(6), CorrespondenceAddressPostalCodePObox char(6), Associoation INTEGER(5), Empty3 INTEGER(8));";
    private static final String QUERY2 = "INSERT INTO FinancialInstitutions (ID, Name, CommercialBankName, IdentifyingCodes, SortBankCode, SortCodeName, AbbreviationBankName, TownSeatBank, StreetAndBuildingNumberBank, PostalCodeBank, TownPostOfficeBank, NumberBanksPOUnitBox, PostalCodePostOfficePOUnixBox, TelephoneNumberBank, TelephoneNumberBank2, FaxNumberBank, FaxNumberBank2, DateSortCodeGeneration, BICcode, SEPABICcode, WebsiteAddressBank, Province, Powiat) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";


    public static void main(String[] args) throws IOException, SQLException, Exception {
        Connection connect = Jsoup.connect("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        Document document = connect.get();
        String financialInstitutions = document.wholeText();


        try (java.sql.Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BanksBase?useSSL=false&characterEncoding=utf8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root", "mysqltest")) {

            Statement stat = connection.createStatement();
            String sql = QUERY1;
            stat.executeUpdate(sql);
            System.out.println("Stworzyłem tabelę \"FinancialInstitutions\"");
            StringTokenizer oneLine = new StringTokenizer(financialInstitutions, "\\n");


            while (oneLine.hasMoreTokens()) {

                StringTokenizer oneWord = new StringTokenizer(oneLine.nextToken(), "\\t");

                int tableCounter = 0;
                int phoneCounter = 0;
                while (oneWord.hasMoreTokens()) {
                    System.out.println(oneWord.nextToken());

                    BankData bankData = new BankData();
                    StringBuilder stringBuilder = new StringBuilder();

                    String nextWord = oneWord.nextToken();

                    if (nextWord.matches("[0-9]{1,4}") && bankData.getID() == null && tableCounter == 0) {
                        bankData.setID(Integer.valueOf(nextWord));
                        tableCounter = 1;
                        continue;
                    } else if ((bankData.getID() != null && !(nextWord.matches("[0-9]{1,4}")) || !(nextWord.contains(","))) && tableCounter > 0) {

                        stringBuilder.append(nextWord);
                        tableCounter = 2;
                        continue;
                    } else if ((!(nextWord.matches("[0-9]{1,4}"))) && tableCounter > 1) {

                        bankData.setName(stringBuilder.toString());

                        clearStringBuildierText(stringBuilder);

                        stringBuilder.append(nextWord);
                        tableCounter = 3;
                        continue;
                    } else if ((nextWord.matches("[0-9]{1,4}") || nextWord.contains(",")) && tableCounter > 2) {
                        if (bankData.getName().isEmpty()) {
                            bankData.setName(stringBuilder.toString());
                        } else {
                            bankData.setCommercialBankName(stringBuilder.toString());
                        }
                        clearStringBuildierText(stringBuilder);
                        bankData.setIdentifyingCodes(nextWord);
                        tableCounter = 4;
                        continue;
                    } else if ((nextWord.matches("[0-9]{8}")) && tableCounter > 3) {

                        bankData.setSortBankCode(Integer.valueOf(nextWord));
                        tableCounter = 5;
                        continue;
                    } else if ((!(bankData.getabbreviationBankNames().contains(nextWord))) && tableCounter > 4) {
                        stringBuilder.append(nextWord);
                        tableCounter = 6;
                        continue;
                    } else if ((bankData.getabbreviationBankNames().contains(nextWord)) && tableCounter > 5) {
                        bankData.setSortCodeName(stringBuilder.toString());

                        clearStringBuildierText(stringBuilder);

                        bankData.setAbbreviationBankName(nextWord);
                        tableCounter = 7;
                        continue;
                    } else if (!(bankData.getAddressPredicates().contains(nextWord)) && tableCounter > 6) {
                        stringBuilder.append(nextWord);
                        tableCounter = 8;
                        continue;
                    } else if ((bankData.getAddressPredicates().contains(nextWord)) && tableCounter > 7) {
                        bankData.setTownSeatBank(stringBuilder.toString());

                        clearStringBuildierText(stringBuilder);

                        stringBuilder.append(nextWord);
                        tableCounter = 9;
                        continue;
                    } else if (!(nextWord.matches("[0-9]{2}-[0-9]{3}")) && tableCounter > 8) {
                        stringBuilder.append(nextWord);
                        tableCounter = 10;
                        continue;
                    } else if (!(nextWord.matches("[0-9]{1,4}")) && tableCounter != 11) {
                        bankData.setStreetAndBuildingNumberBank(stringBuilder.toString());
                        clearStringBuildierText(stringBuilder);
                        bankData.setPostalCodeBank(nextWord);
                        tableCounter = 11;
                        continue;
                    } else if (!(nextWord.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}"))) {
                        if (nextWord.matches("[0-9]{2}-[0-9]{3}")) {
                            bankData.setNumberBanksPOUnitBox(stringBuilder.toString());
                            clearStringBuildierText(stringBuilder);
                            bankData.setPostalCodePostOfficePOUnixBox(nextWord);
                            continue;
                        } else if ((nextWord.matches("[0-9]{2}")) && tableCounter == 12) {
                            if (phoneCounter == 0) {
                                bankData.setNumberBanksPOUnitBox(stringBuilder.toString());
                                clearStringBuildierText(stringBuilder);
                            } else if (bankData.countPhoneNumber().contains(phoneCounter)) {
                                stringBuilder.append(nextWord);
                            } else if (phoneCounter == 4) {
                                if (bankData.getTelephoneNumberBank().isEmpty()) {
                                    bankData.setTelephoneNumberBank(stringBuilder.toString());
                                    clearStringBuildierText(stringBuilder);
                                    phoneCounter = 0;
                                } else if (bankData.getTelephoneNumberBank2().isEmpty()) {
                                    bankData.setTelephoneNumberBank2(stringBuilder.toString());
                                    clearStringBuildierText(stringBuilder);
                                    phoneCounter = 0;
                                } else if (bankData.getFaxNumberBank().isEmpty()) {
                                    bankData.setFaxNumberBank(stringBuilder.toString());
                                    clearStringBuildierText(stringBuilder);
                                    phoneCounter = 0;
                                } else if (bankData.getFaxNumberBank2().isEmpty()) {
                                    bankData.setFaxNumberBank2(stringBuilder.toString());
                                    clearStringBuildierText(stringBuilder);
                                    phoneCounter = 0;
                                }
                            }

                            phoneCounter++;
                            continue;
                        } else if ((nextWord.matches("[0-9]{3}")) && tableCounter == 12) {
                            stringBuilder.append(nextWord);

                            continue;
                        }
                        stringBuilder.append(nextWord);
                        tableCounter = 12;
                        continue;
                    } else if (!(nextWord.matches("[A-Z]{8,11}"))) {
                        Date date = Date.valueOf(nextWord);
                        bankData.setDateSortCodeGeneration(date);
                        tableCounter = 13;
                        continue;
                    } else if (!(nextWord.contains("www"))) {
                        if (bankData.getBICcode().isEmpty()) {
                            bankData.setBICcode(nextWord);
                        } else if (bankData.getSEPABICcode().isEmpty()) {
                            bankData.setSEPABICcode(nextWord);
                        }
                        continue;
                    } else if (!(nextWord.matches(".*[A-Z]{2}.*"))) {
                        bankData.setWebsiteAddressBank(nextWord);
                        continue;
                    } else if (!(nextWord.matches(".*[a-z]{2}.*"))) {
                        bankData.setProvince(nextWord);
                        continue;
                    } else if (nextWord.matches(".*[a-z]{2}.*")) {
                        bankData.setPowiat(nextWord);
                    }

                    PreparedStatement ps = connection.prepareStatement(QUERY2);
                    ps.setInt(1, bankData.getID());
                    ps.setString(2, bankData.getName());
                    ps.setString(3, bankData.getCommercialBankName());
                    ps.setString(4, bankData.getIdentifyingCodes());
                    ps.setInt(5, bankData.getSortBankCode());
                    ps.setString(6, bankData.getSortCodeName());
                    ps.setString(7, bankData.getAbbreviationBankName());
                    ps.setString(8, bankData.getTownSeatBank());
                    ps.setString(9, bankData.getStreetAndBuildingNumberBank());
                    ps.setString(10, bankData.getPostalCodeBank());
                    ps.setString(11, bankData.getTownSeatBank());
                    ps.setString(12, bankData.getNumberBanksPOUnitBox());
                    ps.setString(13, bankData.getPostalCodePostOfficePOUnixBox());
                    ps.setString(14, bankData.getTelephoneNumberBank());
                    ps.setString(15, bankData.getTelephoneNumberBank2());
                    ps.setString(16, bankData.getFaxNumberBank());
                    ps.setString(17, bankData.getFaxNumberBank2());
                    ps.setDate(18, bankData.getDateSortCodeGeneration());
                    ps.setString(19, bankData.getBICcode());
                    ps.setString(20, bankData.getSEPABICcode());
                    ps.setString(21, bankData.getWebsiteAddressBank());
                    ps.setString(22, bankData.getProvince());
                    ps.setString(23, bankData.getPowiat());
                    ps.executeUpdate();

                    tableCounter = 0;
                }

            }

            System.out.println("Wszystko poszło jak należy");


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private static void clearStringBuildierText(StringBuilder stringBuilder) {
        stringBuilder.delete(0, stringBuilder.length());
    }
}