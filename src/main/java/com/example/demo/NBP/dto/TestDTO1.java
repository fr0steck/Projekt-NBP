package com.example.demo.NBP.dto;

public class TestDTO1 {
    private ArrayOfExchangeRatesTable ArrayOfExchangeRatesTable;

    public ArrayOfExchangeRatesTable getArrayOfExchangeRatesTable ()
    {
        return ArrayOfExchangeRatesTable;
    }

    public void setArrayOfExchangeRatesTable (ArrayOfExchangeRatesTable ArrayOfExchangeRatesTable)
    {
        this.ArrayOfExchangeRatesTable = ArrayOfExchangeRatesTable;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ArrayOfExchangeRatesTable = "+ArrayOfExchangeRatesTable+"]";
    }
}
class ArrayOfExchangeRatesTable
{
    private ExchangeRatesTable ExchangeRatesTable;

    public ExchangeRatesTable getExchangeRatesTable ()
    {
        return ExchangeRatesTable;
    }

    public void setExchangeRatesTable (ExchangeRatesTable ExchangeRatesTable)
    {
        this.ExchangeRatesTable = ExchangeRatesTable;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ExchangeRatesTable = "+ExchangeRatesTable+"]";
    }
}
class ExchangeRatesTable
{
    private String No;

    private Rates Rates;

    private String Table;

    private String EffectiveDate;

    public String getNo ()
    {
        return No;
    }

    public void setNo (String No)
    {
        this.No = No;
    }

    public Rates getRates ()
    {
        return Rates;
    }

    public void setRates (Rates Rates)
    {
        this.Rates = Rates;
    }

    public String getTable ()
    {
        return Table;
    }

    public void setTable (String Table)
    {
        this.Table = Table;
    }

    public String getEffectiveDate ()
    {
        return EffectiveDate;
    }

    public void setEffectiveDate (String EffectiveDate)
    {
        this.EffectiveDate = EffectiveDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [No = "+No+", Rates = "+Rates+", Table = "+Table+", EffectiveDate = "+EffectiveDate+"]";
    }
}
class Rates
{
    private Rate[] Rate;

    public Rate[] getRate ()
    {
        return Rate;
    }

    public void setRate (Rate[] Rate)
    {
        this.Rate = Rate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Rate = "+Rate+"]";
    }
}


class Rate
{
    private String Currency;

    private String Mid;

    private String Code;

    public String getCurrency ()
    {
        return Currency;
    }

    public void setCurrency (String Currency)
    {
        this.Currency = Currency;
    }

    public String getMid ()
    {
        return Mid;
    }

    public void setMid (String Mid)
    {
        this.Mid = Mid;
    }

    public String getCode ()
    {
        return Code;
    }

    public void setCode (String Code)
    {
        this.Code = Code;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Currency = "+Currency+", Mid = "+Mid+", Code = "+Code+"]";
    }
}

