package business;

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

/**
 *
 * @author Michael Mueller
 */
@Entity
@Table(name="tblMembers")
public class Member {

    /**
     * @return the tourIsFinished
     */
    public boolean isTourIsFinished()
    {
        return tourIsFinished;
    }

    /**
     * @param tourIsFinished the tourIsFinished to set
     */
    public void setTourIsFinished(boolean tourIsFinished)
    {
        this.tourIsFinished = tourIsFinished;
    }

    /**
     * @return the noErrors
     */
    public boolean getNoerrors()
    {
        return isNoErrors();
    }

    /**
     * @param noErrors the noErrors to set
     */
    public void setNoErrors(boolean noErrors)
    {
        this.noErrors = noErrors;
    }
    @Id
    @Column(name="MemID")
    private String memid;
    
    //@Column(name="LastName")
    //private String lastnm;
    
    @Column(name="FirstName")
    private String firstnm;
    
    @Column(name="Weight")
    private double weight;
    
    
    @Column(name = "Height")
    private int height;

    
    @Column(name= "Age")
    private int age;
    
    @Column(name = "Gender")
    private boolean Gender;
   
    @Column(name = "tourfinished")
    private String tourfinished;

   //@Column(name="MiddleName")
    //private String middlenm;
    
    //@Column(name="Status")
    //private String status;
    
    @Column(name="MemDt")
    @Temporal(TemporalType.DATE)
    private Date memdt;
    
    @Column(name="Password")
    private String password;
    
    
    @Column(name="Steps")
    private int steps;
    
    @Column(name="Counter")
    private int counter;

     @Column(name="Counter2")
    private int counter2;

    
    @Column(name = "StartDate")
    private String startdate;
    
    @Column(name = "TORF1")
    private boolean loctorf1;
    
     @Column(name = "TORF2")
    private boolean loctorf2;
 
      @Column(name = "TORF3")
    private boolean loctorf3;
     
      @Column(name = "TORF4")
    private boolean loctorf4;
       
      @Column(name = "TORF5")
    private boolean loctorf5;
       
      @Column(name = "TORF6")
    private boolean loctorf6;
       
      @Column(name = "TORF7")
    private boolean loctorf7;
      
       @Column(name = "TORF8")
    private boolean loctorf8;
      
       @Column(name = "TORF9")
    private boolean loctorf9;
      
       @Column(name = "TORF10")
    private boolean loctorf10;
         
       @Column(name = "TORF11")
    private boolean loctorf11;
         
       @Column(name = "TORF12")
    private boolean loctorf12;
         
        
       @Column(name = "TORF13")
    private boolean loctorf13;
          
       @Column(name = "TORF14")
    private boolean loctorf14;
          
       @Column(name = "TORF15")
    private boolean loctorf15;
     
       @Column(name = "TORF16")
    private boolean loctorf16;
           
       @Column(name = "TORF17")
    private boolean loctorf17;
            
       @Column(name = "TORF18")
    private boolean loctorf18;
              
       @Column(name = "TORF19")
    private boolean loctorf19;
       @Column(name = "TORF20")
    private boolean loctorf20;
               
       @Column(name = "TORF21")
    private boolean loctorf21;
                
       @Column(name = "TORF22")
    private boolean loctorf22;
              
       @Column(name = "TORF23")
    private boolean loctorf23;
   
    
                
       @Column(name = "TORF24")
    private boolean loctorf24;
              
       @Column(name = "TORF25")
    private boolean loctorf25; 
       
    @Column(name = "TORF26")
    private boolean loctorf26;
              
       @Column(name = "TORF27")
    private boolean loctorf27;     
       
        @Column(name = "TORF28")
    private boolean loctorf28;
       
       

    // @Column(name="YTD_Total")
   // private double ytdtot;
    @Column(name = "TORF1a")
    private boolean loctorf1a;
    
     @Column(name = "TORF2a")
    private boolean loctorf2a;
 
      @Column(name = "TORF3a")
    private boolean loctorf3a;
     
      @Column(name = "TORF4a")
    private boolean loctorf4a;
       
      @Column(name = "TORF5a")
    private boolean loctorf5a;
       
      @Column(name = "TORF6a")
    private boolean loctorf6a;
       
      @Column(name = "TORF7a")
    private boolean loctorf7a;
      
       @Column(name = "TORF8a")
    private boolean loctorf8a;
      
       @Column(name = "TORF9a")
    private boolean loctorf9a;
      
       @Column(name = "TORF10a")
    private boolean loctorf10a;
         
       @Column(name = "TORF11a")
    private boolean loctorf11a;
         
       @Column(name = "TORF12a")
    private boolean loctorf12a;
         
        
       @Column(name = "TORF13a")
    private boolean loctorf13a;
          
       @Column(name = "TORF14a")
    private boolean loctorf14a;
          
       @Column(name = "TORF15a")
    private boolean loctorf15a;
     
       @Column(name = "TORF16a")
    private boolean loctorf16a;
           
       @Column(name = "TORF17a")
    private boolean loctorf17a;
            
       @Column(name = "TORF18a")
    private boolean loctorf18a;
              
       @Column(name = "TORF19a")
    private boolean loctorf19a;
       @Column(name = "TORF20a")
    private boolean loctorf20a;
               
       @Column(name = "TORF21a")
    private boolean loctorf21a;
                
       @Column(name = "TORF22a")
    private boolean loctorf22a;
              
       @Column(name = "TORF23a")
    private boolean loctorf23a;
    
       @Column(name = "Calories")
       private double caloriesBurned;
       
        @Column(name = "totalCalories")
       private double totalcaloriesburned;
       
    //@Column(name="YTD_Total_Dt")
    //@Temporal(TemporalType.DATE)
    //private Date ytdtotdt;
    
    
   // @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "MemId")
    //private List<Purchase> purchases;
    
    @Transient
    private String passattempt;
    @Transient
    private int StepsForToday;
    @Transient
    private String dateOfToday="";
    @Transient
    private boolean EnterWasPressed;
    @Transient
    private int totalSteps;
    @Transient 
    private boolean noErrors;
    @Transient
    private int returnzero;
     @Transient
    private int returnone;
    
   @Transient
   private boolean  tourIsFinished;
     
     
    
    public Member() {
        this.memid="";
        //this.lastnm="";
        this.firstnm="";
        //this.middlenm="";
      //  this.status="";
        this.startdate = "";
        
        this.steps = 0;
        this.memdt=null;
        this.weight = 0;
        this.password="";
        this.noErrors =false;
        this.age =0;
        this.counter2 =0;
        this.returnone =0;
        this.returnzero =1;
        
        this.Gender =false;
        this.loctorf1=false;
        this.loctorf2=false;
        this.loctorf3=false;
        this.loctorf4 = false;
        this.loctorf5 = false;
        this.loctorf6 = false;
        this.loctorf7 = false;
        this.loctorf8 = false;
        this.loctorf9 = false;
        this.loctorf10 = false;
        this.loctorf11 = false;
         this.loctorf12=false;
        this.loctorf13=false;
        this.loctorf14=false;
        this.loctorf15 = false;
        this.loctorf16 = false;
        this.loctorf17 = false;
        this.loctorf18 = false;
        this.loctorf19 = false;
        this.loctorf20 = false;
        this.loctorf21 = false;
        this.loctorf22 = false;
        this.loctorf23 = false;
         this.loctorf24 = false;
        this.loctorf25 = false;
        this.loctorf26 = false;
        this.loctorf27 = false;
        this.loctorf28 = false;
        
        this.tourIsFinished=false;
        this.tourfinished="false";
        
        
    }
    
  
    
    
    

    public String getMemid()
    {
        return memid;
    }

    public void setMemid(String memid)
    {
        this.memid = memid;
    }
/*
    public String getLastnm() 
    {
        return lastnm;
    }
*/
  /*
    public void setLastnm(String lastnm)
    {
        this.lastnm = lastnm;
    }
*/
    public String getFirstnm()
    {
        return firstnm;
    }

    public void setFirstnm(String firstnm)
    {
        this.firstnm = firstnm;
    }
/*
    public String getMiddlenm() 
    {
        return middlenm;
    }
*/
  /*
    public void setMiddlenm(String middlenm) 
    {
        this.middlenm = middlenm;
    }
*/
    /*
    public String getStatus() 
    {
        return status;
    }
    */
/*
    public void setStatus(String status)
    {
        this.status = status;
    }
*/
   public Date getMemdt() 
    {
        return memdt;
    }

    public void setMemdt(Date memdt)
    {
        this.memdt = memdt;
    }
    
    public String getMemDtS()
    {
        SimpleDateFormat sdf = 
                new SimpleDateFormat("MM-dd-yyyy");
        return sdf.format(this.getMemdt());
    }
    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
    
    public void setPassAttempt(String patt)
    {
        this.setPassattempt(patt);
    }
    
    public boolean isAuthenticated()
    {
            boolean pattempt=false;
        
        
            if (this.getPassword().equals(this.getPassattempt()))
            {
                pattempt=true;
            }
        
        return pattempt;
    }
    
    public String getDateoftoday()
    {
        
        return this.getDateOfToday();
    }
    
    public void setDateoftoday(String date)
    {
        this.setDateOfToday(date);
        
    }
    
    
    
     public boolean getEnterwaspressed()
    {
        
        return this.isEnterWasPressed();
    }
    
    public void setEnterwaspressed(boolean enterWasPressed)
    {
        this.setEnterWasPressed(enterWasPressed);
        
    }
    
    
    
    
    
    
    /*
    public List<Purchase> getPurchases()
    {
        
        return this.purchases;     
    }
    
    
    
    public void setPurchases(List<Purchase> pur)
    {
      this.purchases = pur;  
    }
    
    public void addPurchase(Purchase p)
    {
        
        this.purchases.add(p);//add the new purchase just created
        
    }
            
    public double getTotalDue()
    {
        double total =0;
        for(Purchase p: this.purchases)
        {
            if(p.getTranstype().equalsIgnoreCase("D"))
            {
               total += p.getAmt();
                
            }
            else
            {
                total-= p.getAmt();
            }
            
        }
        return total;
    }
    */

    /**
     * @return the weight
     */
   

    /**
     * @param weight the weight to set
     */
   

    /**
     * @return the passattempt
     */
    public String getPassattempt()
    {
        return passattempt;
    }

    /**
     * @param passattempt the passattempt to set
     */
    public void setPassattempt(String passattempt)
    {
        this.passattempt = passattempt;
    }
    
    public int getStepsfortoday()
    {
        return getStepsForToday();
    }

    /**
     * @param passattempt the passattempt to set
     */
    public void setStepsfortoday(int stepsForToday)
    {
        this.setStepsForToday(stepsForToday);
    }
    
     public int getTotalsteps()
    {
        return getTotalSteps();
    }

    /**
     * @param passattempt the passattempt to set
     */
    public void setTotalsteps(int totSteps)
    {
        this.setTotalSteps(this.getTotalSteps() + totSteps);
    }
    
     public int getsteps()
    {
        return getTotalSteps();
    }

    /**
     * @param passattempt the passattempt to set
     */
    public void setsteps(int totSteps)
    {
        this.setTotalSteps(getSteps());
    }

    /**
     * @return the counter
     */
    public int getCounter()
    {
        return counter;
    }

    /**
     * @param counter the counter to set
     */
    public void setCounter(int counter)
    {
        this.counter = counter;
    }

    /**
     * @return the startdate
     */
    public String getStartdate()
    {
        return startdate;
    }

    /**
     * @param startdate the startdate to set
     */
    public void setStartdate(String startdate)
    {
        this.startdate = startdate;
    }

    /**
     * @return the steps
     */
    public int getSteps()
    {
        return steps;
    }

    /**
     * @param steps the steps to set
     */
    public void setSteps(int steps)
    {
        this.steps = steps;
    }

    /**
     * @return the loctorf1
     */
    public boolean getLoctorf1()
    {
        return isLoctorf1();
    }

    /**
     * @param loctorf1 the loctorf1 to set
     */
    public void setLoctorf1(boolean torf)
    {
        this.loctorf1 = torf;
    }

    /**
     * @return the loctorf2
     */
    public boolean getLoctorf2()
    {
        return isLoctorf2();
    }

    /**
     * @param loctorf2 the loctorf2 to set
     */
    public void setLoctorf2(boolean toorf)
    {
        this.loctorf2 = toorf;
    }

    /**
     * @return the loctorf3
     */
    public boolean getLoctorf3()
    {
        return isLoctorf3();
    }

    /**
     * @param loctorf3 the loctorf3 to set
     */
    public void setLoctorf3(boolean loctorf3)
    {
        this.loctorf3 = loctorf3;
    }

    /**
     * @return the loctorf4
     */
    public boolean getLoctorf4()
    {
        return isLoctorf4();
    }

    /**
     * @param loctorf4 the loctorf4 to set
     */
    public void setLoctorf4(boolean loctorf4)
    {
        this.loctorf4 = loctorf4;
    }

    /**
     * @return the loctorf5
     */
    public boolean getLoctorf5()
    {
        return isLoctorf5();
    }

    /**
     * @param loctorf5 the loctorf5 to set
     */
    public void setLoctorf5(boolean loctorf5)
    {
        this.loctorf5 = loctorf5;
    }

    /**
     * @return the loctorf6
     */
    public boolean getLoctorf6()
    {
        return isLoctorf6();
    }

    /**
     * @param loctorf6 the loctorf6 to set
     */
    public void setLoctorf6(boolean loctorf6)
    {
        this.loctorf6 = loctorf6;
    }

    /**
     * @return the loctorf7
     */
    public boolean getLoctorf7()
    {
        return isLoctorf7();
    }

    /**
     * @param loctorf7 the loctorf7 to set
     */
    public void setLoctorf7(boolean loctorf7)
    {
        this.loctorf7 = loctorf7;
    }

    /**
     * @return the loctorf8
     */
    public boolean getLoctorf8()
    {
        return isLoctorf8();
    }

    /**
     * @param loctorf8 the loctorf8 to set
     */
    public void setLoctorf8(boolean loctorf8)
    {
        this.loctorf8 = loctorf8;
    }

    /**
     * @return the loctorf9
     */
    public boolean getLoctorf9()
    {
        return isLoctorf9();
    }

    /**
     * @param loctorf9 the loctorf9 to set
     */
    public void setLoctorf9(boolean loctorf9)
    {
        this.loctorf9 = loctorf9;
    }

    /**
     * @return the loctorf10
     */
    public boolean getLoctorf10()
    {
        return isLoctorf10();
    }

    /**
     * @param loctorf10 the loctorf10 to set
     */
    public void setLoctorf10(boolean loctorf10)
    {
        this.loctorf10 = loctorf10;
    }

    /**
     * @return the loctorf11
     */
    public boolean getLoctorf11()
    {
        return isLoctorf11();
    }

    /**
     * @param loctorf11 the loctorf11 to set
     */
    public void setLoctorf11(boolean loctorf11)
    {
        this.loctorf11 = loctorf11;
    }

    /**
     * @return the loctorf12
     */
    public boolean getLoctorf12()
    {
        return isLoctorf12();
    }

    /**
     * @param loctorf12 the loctorf12 to set
     */
    public void setLoctorf12(boolean loctorf12)
    {
        this.loctorf12 = loctorf12;
    }

    /**
     * @return the loctorf13
     */
    public boolean getLoctorf13()
    {
        return isLoctorf13();
    }

    /**
     * @param loctorf13 the loctorf13 to set
     */
    public void setLoctorf13(boolean loctorf13)
    {
        this.loctorf13 = loctorf13;
    }

    /**
     * @return the loctorf14
     */
    public boolean getLoctorf14()
    {
        return isLoctorf14();
    }

    /**
     * @param loctorf14 the loctorf14 to set
     */
    public void setLoctorf14(boolean loctorf14)
    {
        this.loctorf14 = loctorf14;
    }

    /**
     * @return the loctorf15
     */
    public boolean getLoctorf15()
    {
        return isLoctorf15();
    }

    /**
     * @param loctorf15 the loctorf15 to set
     */
    public void setLoctorf15(boolean loctorf15)
    {
        this.loctorf15 = loctorf15;
    }

    /**
     * @return the loctorf16
     */
    public boolean getLoctorf16()
    {
        return isLoctorf16();
    }

    /**
     * @param loctorf16 the loctorf16 to set
     */
    public void setLoctorf16(boolean loctorf16)
    {
        this.loctorf16 = loctorf16;
    }

    /**
     * @return the loctorf17
     */
    public boolean getLoctorf17()
    {
        return isLoctorf17();
    }

    /**
     * @param loctorf17 the loctorf17 to set
     */
    public void setLoctorf17(boolean loctorf17)
    {
        this.loctorf17 = loctorf17;
    }

    /**
     * @return the loctorf18
     */
    public boolean getLoctorf18()
    {
        return isLoctorf18();
    }

    /**
     * @param loctorf18 the loctorf18 to set
     */
    public void setLoctorf18(boolean loctorf18)
    {
        this.loctorf18 = loctorf18;
    }

    /**
     * @return the loctorf19
     */
    public boolean getLoctorf19()
    {
        return isLoctorf19();
    }

    /**
     * @param loctorf19 the loctorf19 to set
     */
    public void setLoctorf19(boolean loctorf19)
    {
        this.loctorf19 = loctorf19;
    }

    /**
     * @return the loctorf20
     */
    public boolean getLoctorf20()
    {
        return isLoctorf20();
    }

    /**
     * @param loctorf20 the loctorf20 to set
     */
    public void setLoctorf20(boolean loctorf20)
    {
        this.loctorf20 = loctorf20;
    }

    /**
     * @return the loctorf21
     */
    public boolean getLoctorf21()
    {
        return isLoctorf21();
    }

    /**
     * @param loctorf21 the loctorf21 to set
     */
    public void setLoctorf21(boolean loctorf21)
    {
        this.loctorf21 = loctorf21;
    }

    /**
     * @return the loctorf22
     */
    public boolean getLoctorf22()
    {
        return isLoctorf22();
    }

    /**
     * @param loctorf22 the loctorf22 to set
     */
    public void setLoctorf22(boolean loctorf22)
    {
        this.loctorf22 = loctorf22;
    }

    /**
     * @return the loctorf23
     */
    public boolean getLoctorf23()
    {
        return isLoctorf23();
    }

    /**
     * @param loctorf23 the loctorf23 to set
     */
    public void setLoctorf23(boolean loctorf23)
    {
        this.loctorf23 = loctorf23;
    }

    /**
     * @return the StepsForToday
     */
    public int getStepsForToday()
    {
        return StepsForToday;
    }

    /**
     * @param StepsForToday the StepsForToday to set
     */
    public void setStepsForToday(int StepsForToday)
    {
        this.StepsForToday = StepsForToday;
    }

    /**
     * @return the dateOfToday
     */
    public String getDateOfToday()
    {
        return dateOfToday;
    }

    /**
     * @param dateOfToday the dateOfToday to set
     */
    public void setDateOfToday(String dateOfToday)
    {
        this.dateOfToday = dateOfToday;
    }

    /**
     * @return the EnterWasPressed
     */
    public boolean isEnterWasPressed()
    {
        return EnterWasPressed;
    }

    /**
     * @param EnterWasPressed the EnterWasPressed to set
     */
    public void setEnterWasPressed(boolean EnterWasPressed)
    {
        this.EnterWasPressed = EnterWasPressed;
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
     * @return the noErrors
     */
    public boolean isNoErrors()
    {
        return noErrors;
    }
   
    public String returnFalse()
    {
        
        return "false";
    }

    /**
     * @return the height
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height)
    {
        this.height = height;
    }

    /**
     * @return the loctorf1
     */
    public boolean isLoctorf1()
    {
        return loctorf1;
    }

    /**
     * @return the loctorf2
     */
    public boolean isLoctorf2()
    {
        return loctorf2;
    }

    /**
     * @return the loctorf3
     */
    public boolean isLoctorf3()
    {
        return loctorf3;
    }

    /**
     * @return the loctorf4
     */
    public boolean isLoctorf4()
    {
        return loctorf4;
    }

    /**
     * @return the loctorf5
     */
    public boolean isLoctorf5()
    {
        return loctorf5;
    }

    /**
     * @return the loctorf6
     */
    public boolean isLoctorf6()
    {
        return loctorf6;
    }

    /**
     * @return the loctorf7
     */
    public boolean isLoctorf7()
    {
        return loctorf7;
    }

    /**
     * @return the loctorf8
     */
    public boolean isLoctorf8()
    {
        return loctorf8;
    }

    /**
     * @return the loctorf9
     */
    public boolean isLoctorf9()
    {
        return loctorf9;
    }

    /**
     * @return the loctorf10
     */
    public boolean isLoctorf10()
    {
        return loctorf10;
    }

    /**
     * @return the loctorf11
     */
    public boolean isLoctorf11()
    {
        return loctorf11;
    }

    /**
     * @return the loctorf12
     */
    public boolean isLoctorf12()
    {
        return loctorf12;
    }

    /**
     * @return the loctorf13
     */
    public boolean isLoctorf13()
    {
        return loctorf13;
    }

    /**
     * @return the loctorf14
     */
    public boolean isLoctorf14()
    {
        return loctorf14;
    }

    /**
     * @return the loctorf15
     */
    public boolean isLoctorf15()
    {
        return loctorf15;
    }

    /**
     * @return the loctorf16
     */
    public boolean isLoctorf16()
    {
        return loctorf16;
    }

    /**
     * @return the loctorf17
     */
    public boolean isLoctorf17()
    {
        return loctorf17;
    }

    /**
     * @return the loctorf18
     */
    public boolean isLoctorf18()
    {
        return loctorf18;
    }

    /**
     * @return the loctorf19
     */
    public boolean isLoctorf19()
    {
        return loctorf19;
    }

    /**
     * @return the loctorf20
     */
    public boolean isLoctorf20()
    {
        return loctorf20;
    }

    /**
     * @return the loctorf21
     */
    public boolean isLoctorf21()
    {
        return loctorf21;
    }

    /**
     * @return the loctorf22
     */
    public boolean isLoctorf22()
    {
        return loctorf22;
    }

    /**
     * @return the loctorf23
     */
    public boolean isLoctorf23()
    {
        return loctorf23;
    }
    
    
    public boolean isLoctorf1a()
    {
        return loctorf1a;
    }
    
    public void isLoctorf1a(boolean LocTOF1a)
    {
        this.setLoctorf1a(LocTOF1a);
    }

    /**
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * @param loctorf1a the loctorf1a to set
     */
    public void setLoctorf1a(boolean loctorf1a)
    {
        this.loctorf1a = loctorf1a;
    }

    /**
     * @return the loctorf2a
     */
    public boolean isLoctorf2a()
    {
        return loctorf2a;
    }

    /**
     * @param loctorf2a the loctorf2a to set
     */
    public void setLoctorf2a(boolean loctorf2a)
    {
        this.loctorf2a = loctorf2a;
    }

    /**
     * @return the loctorf3a
     */
    public boolean isLoctorf3a()
    {
        return loctorf3a;
    }

    /**
     * @param loctorf3a the loctorf3a to set
     */
    public void setLoctorf3a(boolean loctorf3a)
    {
        this.loctorf3a = loctorf3a;
    }

    /**
     * @return the loctorf4a
     */
    public boolean isLoctorf4a()
    {
        return loctorf4a;
    }

    /**
     * @param loctorf4a the loctorf4a to set
     */
    public void setLoctorf4a(boolean loctorf4a)
    {
        this.loctorf4a = loctorf4a;
    }

    /**
     * @return the loctorf5a
     */
    public boolean isLoctorf5a()
    {
        return loctorf5a;
    }

    /**
     * @param loctorf5a the loctorf5a to set
     */
    public void setLoctorf5a(boolean loctorf5a)
    {
        this.loctorf5a = loctorf5a;
    }

    /**
     * @return the loctorf6a
     */
    public boolean isLoctorf6a()
    {
        return loctorf6a;
    }

    /**
     * @param loctorf6a the loctorf6a to set
     */
    public void setLoctorf6a(boolean loctorf6a)
    {
        this.loctorf6a = loctorf6a;
    }

    /**
     * @return the loctorf7a
     */
    public boolean isLoctorf7a()
    {
        return loctorf7a;
    }

    /**
     * @param loctorf7a the loctorf7a to set
     */
    public void setLoctorf7a(boolean loctorf7a)
    {
        this.loctorf7a = loctorf7a;
    }

    /**
     * @return the loctorf8a
     */
    public boolean isLoctorf8a()
    {
        return loctorf8a;
    }

    /**
     * @param loctorf8a the loctorf8a to set
     */
    public void setLoctorf8a(boolean loctorf8a)
    {
        this.loctorf8a = loctorf8a;
    }

    /**
     * @return the loctorf9a
     */
    public boolean isLoctorf9a()
    {
        return loctorf9a;
    }

    /**
     * @param loctorf9a the loctorf9a to set
     */
    public void setLoctorf9a(boolean loctorf9a)
    {
        this.loctorf9a = loctorf9a;
    }

    /**
     * @return the loctorf10a
     */
    public boolean isLoctorf10a()
    {
        return loctorf10a;
    }

    /**
     * @param loctorf10a the loctorf10a to set
     */
    public void setLoctorf10a(boolean loctorf10a)
    {
        this.loctorf10a = loctorf10a;
    }

    /**
     * @return the loctorf11a
     */
    public boolean isLoctorf11a()
    {
        return loctorf11a;
    }

    /**
     * @param loctorf11a the loctorf11a to set
     */
    public void setLoctorf11a(boolean loctorf11a)
    {
        this.loctorf11a = loctorf11a;
    }

    /**
     * @return the loctorf12a
     */
    public boolean isLoctorf12a()
    {
        return loctorf12a;
    }

    /**
     * @param loctorf12a the loctorf12a to set
     */
    public void setLoctorf12a(boolean loctorf12a)
    {
        this.loctorf12a = loctorf12a;
    }

    /**
     * @return the loctorf13a
     */
    public boolean isLoctorf13a()
    {
        return loctorf13a;
    }

    /**
     * @param loctorf13a the loctorf13a to set
     */
    public void setLoctorf13a(boolean loctorf13a)
    {
        this.loctorf13a = loctorf13a;
    }

    /**
     * @return the loctorf14a
     */
    public boolean isLoctorf14a()
    {
        return loctorf14a;
    }

    /**
     * @param loctorf14a the loctorf14a to set
     */
    public void setLoctorf14a(boolean loctorf14a)
    {
        this.loctorf14a = loctorf14a;
    }

    /**
     * @return the loctorf15a
     */
    public boolean isLoctorf15a()
    {
        return loctorf15a;
    }

    /**
     * @param loctorf15a the loctorf15a to set
     */
    public void setLoctorf15a(boolean loctorf15a)
    {
        this.loctorf15a = loctorf15a;
    }

    /**
     * @return the loctorf16a
     */
    public boolean isLoctorf16a()
    {
        return loctorf16a;
    }

    /**
     * @param loctorf16a the loctorf16a to set
     */
    public void setLoctorf16a(boolean loctorf16a)
    {
        this.loctorf16a = loctorf16a;
    }

    /**
     * @return the loctorf17a
     */
    public boolean isLoctorf17a()
    {
        return loctorf17a;
    }

    /**
     * @param loctorf17a the loctorf17a to set
     */
    public void setLoctorf17a(boolean loctorf17a)
    {
        this.loctorf17a = loctorf17a;
    }

    /**
     * @return the loctorf18a
     */
    public boolean isLoctorf18a()
    {
        return loctorf18a;
    }

    /**
     * @param loctorf18a the loctorf18a to set
     */
    public void setLoctorf18a(boolean loctorf18a)
    {
        this.loctorf18a = loctorf18a;
    }

    /**
     * @return the loctorf19a
     */
    public boolean isLoctorf19a()
    {
        return loctorf19a;
    }

    /**
     * @param loctorf19a the loctorf19a to set
     */
    public void setLoctorf19a(boolean loctorf19a)
    {
        this.loctorf19a = loctorf19a;
    }

    /**
     * @return the loctorf20a
     */
    public boolean isLoctorf20a()
    {
        return loctorf20a;
    }

    /**
     * @param loctorf20a the loctorf20a to set
     */
    public void setLoctorf20a(boolean loctorf20a)
    {
        this.loctorf20a = loctorf20a;
    }

    /**
     * @return the loctorf21a
     */
    public boolean isLoctorf21a()
    {
        return loctorf21a;
    }

    /**
     * @param loctorf21a the loctorf21a to set
     */
    public void setLoctorf21a(boolean loctorf21a)
    {
        this.loctorf21a = loctorf21a;
    }

    /**
     * @return the loctorf22a
     */
    public boolean isLoctorf22a()
    {
        return loctorf22a;
    }

    /**
     * @param loctorf22a the loctorf22a to set
     */
    public void setLoctorf22a(boolean loctorf22a)
    {
        this.loctorf22a = loctorf22a;
    }

    /**
     * @return the loctorf23a
     */
    public boolean isLoctorf23a()
    {
        return loctorf23a;
    }

    /**
     * @param loctorf23a the loctorf23a to set
     */
    public void setLoctorf23a(boolean loctorf23a)
    {
        this.loctorf23a = loctorf23a;
    }

    /**
     * @return the Gender
     */
    public boolean isGender()
    {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(boolean Gender)
    {
        this.Gender = Gender;
    }

    /**
     * @return the counter2
     */
    public int getCounter2()
    {
        return counter2;
    }

    /**
     * @param counter2 the counter2 to set
     */
    public void setCounter2(int counter2)
    {
        this.counter2 = counter2;
    }

    /**
     * @return the returnZero
     */
    public int getReturnzero()
    {
        return 1;
    }

    /**
     * @param returnZero the returnZero to set
     */
    public void setReturnzero(int zero)
    {
        this.returnzero = 1;
    }

    /**
     * @return the returnone
     */
    public int getReturnone()
    {
        return 0;
    }

    /**
     * @param returnone the returnone to set
     */
    public void setReturnone(int returnone)
    {
        this.returnone = 0;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return this.weight;
    }

    /**
     * @return the caloriesBurned
     */
    public double getCaloriesBurned()
    {
        return caloriesBurned;
    }

    /**
     * @param caloriesBurned the caloriesBurned to set
     */
    public void setCaloriesBurned(double caloriesBurned)
    {
        this.caloriesBurned = caloriesBurned;
    }

    /**
     * @return the totalcaloriesburned
     */
    public double getTotalcaloriesburned()
    {
        return totalcaloriesburned;
    }

    /**
     * @param totalcaloriesburned the totalcaloriesburned to set
     */
    public void setTotalcaloriesburned(double totalcaloriesburned)
    {
        this.totalcaloriesburned = totalcaloriesburned;
    }

    /**
     * @return the loctorf24
     */
    public boolean isLoctorf24()
    {
        return loctorf24;
    }

    /**
     * @param loctorf24 the loctorf24 to set
     */
    public void setLoctorf24(boolean loctorf24)
    {
        this.loctorf24 = loctorf24;
    }

    /**
     * @return the loctorf25
     */
    public boolean isLoctorf25()
    {
        return loctorf25;
    }

    /**
     * @param loctorf25 the loctorf25 to set
     */
    public void setLoctorf25(boolean loctorf25)
    {
        this.loctorf25 = loctorf25;
    }

    /**
     * @return the loctorf26
     */
    public boolean isLoctorf26()
    {
        return loctorf26;
    }

    /**
     * @param loctorf26 the loctorf26 to set
     */
    public void setLoctorf26(boolean loctorf26)
    {
        this.loctorf26 = loctorf26;
    }

    /**
     * @return the loctorf27
     */
    public boolean isLoctorf27()
    {
        return loctorf27;
    }

    /**
     * @param loctorf27 the loctorf27 to set
     */
    public void setLoctorf27(boolean loctorf27)
    {
        this.loctorf27 = loctorf27;
    }

    /**
     * @return the loctorf28
     */
    public boolean isLoctorf28()
    {
        return loctorf28;
    }

    /**
     * @param loctorf28 the loctorf28 to set
     */
    public void setLoctorf28(boolean loctorf28)
    {
        this.loctorf28 = loctorf28;
    }

    /**
     * @return the tourfinished
     */
    public String getTourfinished()
    {
        return tourfinished;
    }

    /**
     * @param tourfinished the tourfinished to set
     */
    public void setTourfinished(String tourfinished)
    {
        this.tourfinished = tourfinished;
    }

    /**
     * @return the tourcomplete
     */
   

    /**
     * @param tourcomplete the tourcomplete to set
     */
   
    
    /**
     * @return the Gender
     */
   

    /**
     * @param Gender the Gender to set
     */
   

    /**
     * @param Gender the Gender to set
     */
    
    
    
    
}