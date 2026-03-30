package testNG;

import org.testng.annotations.Test;

public class TestNg_Groups 
{
	@Test(groups = "Smoke")
	public void TitleVerification()
	{
		System.out.println("TitleVerification | "+Thread.currentThread().threadId());
	}
	@Test(groups = "Smoke")
	public void LoginTest()
	{
		System.out.println("LoginTest | "+Thread.currentThread().threadId());
	}
	@Test(groups = "Regression")
	public void SearchTest()
	{
		System.out.println("SearchTest | "+Thread.currentThread().threadId());
	}
	@Test(groups = "Regression")
	public void AddToCartTest()
	{
		System.out.println("AddToCartTest | "+Thread.currentThread().threadId());
	}
	@Test(groups = {"Sanity"})
	public void CheckoutTest()
	{
		System.out.println("PaymentTest | "+Thread.currentThread().threadId());
	}
	@Test(groups = {"Sanity","Regression"})
	public void PaymentTest()
	{
		System.out.println("PaymentTest | "+Thread.currentThread().threadId());
	}
	
}
