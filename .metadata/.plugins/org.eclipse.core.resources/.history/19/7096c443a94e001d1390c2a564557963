package com.canddella.service;
import java.text.SimpleDateFormat; 
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.canddella.entity.Product;



public class OfferAvailabilityCheck {
	
	
	public static boolean getDifferenceDays(String buyingDate, Product product)
		{
		boolean isOfferValid = false;
		long difference_In_Days = 0;
		
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  
       
        try    {
            
            Date buyDate = sdf.parse(buyingDate);
			Date offerDate = sdf.parse(product.getOfferValidTillDate());
            isOfferValid = buyDate.before(offerDate);
        }
            
    catch (Exception e) 
            {
                e.printStackTrace();
            }
    		
            return isOfferValid;

        
		}

	public static boolean isOfferAvailable(String string, Product customerSelectProduct) {
		
		return false;
	}

	
}

