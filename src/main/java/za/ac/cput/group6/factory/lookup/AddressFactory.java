/* Lukhona Tetyana
 * student no: 218119321
 * 09 June 2022 ADP assessment
 * AddressFactory

 */
package za.ac.cput.group6.factory.lookup;


import za.ac.cput.group6.domain.lookup.Address;




public class AddressFactory {

    public static boolean isValidPostalCode(int code){
        return code> 1000 && code<9999;
    }

    public static Address build( String unitNumber, String complexName, String streetNumber, String streetName,
                                 int postalCode)  {
        if (unitNumber.isEmpty() || complexName.isEmpty() || streetNumber.isEmpty() || streetName.isEmpty()){
            System.out.println("Please fill in the blanks");
        }


        return new Address.Builder().setUnitNumber(unitNumber).setComplexName(complexName).setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setPostalCode(postalCode).build();


    }

}