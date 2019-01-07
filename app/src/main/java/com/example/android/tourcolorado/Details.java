package com.example.android.tourcolorado;

public class Details {
    /**
     * name of the place
     */
    private String mPlaceName;

    /**
     * location of the places.
     */
    private String mLocationName;

    /**
     * Image resource id for places.
     */
    private int mImageResourceId;

    /**
     * telephone number of the places.
     **/
    private String mPhoneNum = No_Phone_Provided;

    /**
     * constant value that represents no phone number was provided for this places.
     **/
    private static final String No_Phone_Provided = String.valueOf(-1);


       // * Create a new Details.
       // *
       // * @paramplaceName is the name of the places.
      //  * @param location is the by which person can find the location of places.

       public Details(String placeName, String locationName, int imageResourceId){
           mPlaceName = placeName;
           mLocationName = locationName;
           mImageResourceId = imageResourceId;
       }

    // * Create a new Details.
    // *
    // * @paramplaceName is the name of the place.
    //  * @param location is the by which person can find the location of place.
    //    * @param phoneNum is the phone number for places.

    public Details(String placeName, String locationName, int imageResourceId, String phoneNum){
        mPlaceName = placeName;
        mLocationName = locationName;
        mImageResourceId = imageResourceId;
        mPhoneNum = phoneNum;
    }

       /**
        * Get the name of the place.
        */
    public String getPlaceName(){
        return mPlaceName;
    }

    /**
     * Get the location of places.
     */
    public String getLocationName(){
        return mLocationName;
    }

    /**
     * Get the images of places.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Get the phonenumber of places.
     */
    public String getPhoneNum(){
        return mPhoneNum;
    }

    public boolean hasPhone(){
        if (No_Phone_Provided != mPhoneNum) {
            return true;
        } else return false;
    }
}
