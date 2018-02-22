package JunitAccount.JunitAccount;

import static org.junit.Assert.*;


import org.junit.Test;

import JunitAccount.JunitAccount.Basketball;

public class BasketballTest
{
   
    @Test
    public void testInitial()
    {
      Basketball basketball = new Basketball(5);
      assertEquals(false, basketball.isDribbleable());
    }

    @Test
    public void testInitialDiameter()
    {
      Basketball basketball = new Basketball(5);
      assertEquals(5.0, basketball.getDiameter(), 0.000000);
    }

    @Test
    public void testInflate()
    {
      Basketball basketball = new Basketball(5);
      basketball.inflate();
      assertEquals(true, basketball.isDribbleable());
    }

    @Test
    public void testDiameterAfterInflation()
    {
      Basketball basketball = new Basketball(5);
      basketball.inflate();
      assertEquals(5.0, basketball.getDiameter(), 0.000000);
    }
 }
