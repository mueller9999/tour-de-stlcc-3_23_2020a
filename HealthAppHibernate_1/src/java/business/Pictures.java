/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.sql.Blob;
import java.util.Base64;
import javax.persistence.GenerationType;
import javax.persistence.Transient;

/**
 *
 * @author Michael Mueller
 */

@Entity
@Table (name = "pictures")
public class Pictures implements Serializable
{
   
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id",unique = true,nullable = false)
    private BigInteger imageid;
    
    @Column(name = "pictureName", unique = false,nullable = false,length = 100)
    private String pictureName;
    
    
   
    @Column(name = "image")
    private Blob images;

    
    
    
        @Transient 
        private byte []  imageAsBytes;

        
        
        @Transient
        private String base64Image;
        
    /**
     * @return the imageid
     */
    
    
        
        
    public BigInteger getImageid()
    {
        return imageid;
    }

    /**
     * @param imageid the imageid to set
     */
    public void setImageid(BigInteger imageid)
    {
        this.imageid = imageid;
    }

    /**
     * @return the pictureName
     */
    public String getPictureName()
    {
        return pictureName;
    }

    /**
     * @param pictureName the pictureName to set
     */
    public void setPictureName(String pictureName)
    {
        this.pictureName = pictureName;
    }

    /**
     * @return the images
     */
    public Blob getImages()
    {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(Blob images)
    {
        this.images = images;
    }

    /**
     * @return the imageAsBytes
     */
    public byte[] getImageAsBytes()
    {
        return imageAsBytes;
    }

    /**
     * @param imageAsBytes1
     * @param imageAsBytes the imageAsBytes to set
     */
    public void setImageAsBytes(byte[] imageAsBytes1)
    {
        this.imageAsBytes = imageAsBytes1;
    }

    /**
     * @param imageAsBytes the imageAsBytes to set
     */
   

    /**
     * @return the base64Image
     */
    public String getBase64Image()
    {
        return base64Image;
    }

    /**
     * @param base64Image the base64Image to set
     */
    public void setBase64Image(String base64Image)
    {
        this.base64Image = base64Image;
    }
    /**
     * @return the imageid
     */
  

    /**
     * @param imageid the imageid to set
     * @return 
     */

//public String getByteArrayString()
//{
//   return new String(this.);
//}



public String getByteArrayString1()
{
    
    return new String(this.imageAsBytes);


}
}