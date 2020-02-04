package com.demo.continent.service.impl;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.demo.continent.dao.impl.ContinentDaoImpl;
import com.demo.continent.model.Continent;
import com.demo.continent.model.Countries;

public class ContinentServiceImplTest {
	@InjectMocks
    ContinentServiceImpl continentService;
     
    @Mock
    ContinentDaoImpl continentDao;
    
    @Mock
    Continent continent;
    
    @Mock
    Countries countries;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
    @Test
    public void getAllContinentsTest()
    {
        List<Continent> list = new ArrayList<Continent>();
        
        Continent continent1 = new Continent(1, "Africa");
        Continent continent2 = new Continent(2, "America");
        Continent continent3 = new Continent(3, "Asia");
         
        list.add(continent1);
        list.add(continent2);
        list.add(continent3);
         
        when(continentService.getAllContinents()).thenReturn(list);
       
    }
    
    @Test 
    public void getCountriesInContinentTest() { 
		  List<Countries> list = new ArrayList<Countries>();
		  Countries countries1 = new Countries(1, "South Africa","🇿🇦"); 
		  Countries countries2 = new Countries(2, "USA","🇺🇦"); 
		  Countries countries3 = new Countries(3, "India","IN");
		  
		  list.add(countries1); list.add(countries2); list.add(countries3);
		  
		  when(continentService.getCountriesInContinent(Mockito.anyInt())).thenReturn(list);
	}
	
    @Test
    public void getFlagOfACountryTest() {
    	String flag = "🇿🇦";
    	when(continentService.getFlagOfACountry("abc")).thenReturn(flag);
    }
	
	
}
