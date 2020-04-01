/*Michael Mueller
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.Serializable;
import javax.persistence.Entity;




import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;




@Entity
@Table(name="tblroutewithsteps")
public class RouteWithSteps implements Serializable
{
    
    @Id
    @Column(name ="LocID")
    private int locationID;
    
    @Column(name = "LOCATION")
    private String location;
    
    @Column(name ="ADDRESS")
    private String addresss;
    
     @Column(name ="MILES")
    private double miles;
    
     @Column(name  ="STEPS_TO_GET_TO_LOCATION")
     private int stepsToGetToLocation;
     
     
     @Column(name = "TOTAL_STEPS")
     private int totalSteps;
    
     @Column(name = "UNLOCKED_LOCATION")
     private boolean unlockedLocation;

      //@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
   // @JoinColumn(name = "LocID")
     
    
      @Transient 
     String TheUnlockedDestinationLocation;
     
    /**
     * @return the locationID
     */
    public int getLocationID()
    {
        return locationID;
    }

    /**
     * @param locationID the locationID to set
     */
    
    
    public RouteWithSteps()
    {
        this.locationID=0;
        //this.lastnm="";
        this.location="";
        this.addresss ="";
        this.miles = 0.0;
        this.stepsToGetToLocation =0;
        this.totalSteps=0;
        this.totalSteps =0 ;
        
        
       
        
    }
    
    public void setLocationID(int locationID)
    {
        this.locationID = locationID;
    }

    /**
     * @return the location
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location)
    {
        this.location = location;
    }

    /**
     * @return the addresss
     */
    public String getAddresss()
    {
        return addresss;
    }

    /**
     * @param addresss the addresss to set
     */
    public void setAddresss(String addresss)
    {
        this.addresss = addresss;
    }

    /**
     * @return the miles
     */
    public double getMiles()
    {
        return miles;
    }

    /**
     * @param miles the miles to set
     */
    public void setMiles(double miles)
    {
        this.miles = miles;
    }

    /**
     * @return the stepsToGetToLocation
     */
    public int getStepsToGetToLocation()
    {
        return stepsToGetToLocation;
    }

    /**
     * @param stepsToGetToLocation the stepsToGetToLocation to set
     */
    public void setStepsToGetToLocation(int stepsToGetToLocation)
    {
        this.stepsToGetToLocation = stepsToGetToLocation;
    }

    /**
     * @return the totalSteps
     */
    public int getTotalSteps()
    {
        return totalSteps;
    }

    /**
     * @param totalSteps the totalSteps to set
     */
    public void setTotalSteps(int totalSteps)
    {
        this.totalSteps = totalSteps;
    }

    /**
     * @return the unlockedLocation
     */
    public boolean isUnlockedLocation()
    {
        return unlockedLocation;
    }

    /**
     * @param unlockedLocation the unlockedLocation to set
     */
    public void setUnlockedLocation(boolean unlockedLocation)
    {
        this.unlockedLocation = unlockedLocation;
    }
     
     
}
