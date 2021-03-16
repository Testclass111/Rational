package com.example.project;

public class Rational
{
    
    private int numerator;
    private int denominator;

    /**
     * Default constructor for objects of class Rational
     */
    public Rational() {
        setNumerator(1);
        setDenominator(1);
    }
    
    /**
     * Constructor for objects of class Rational
     * 
     * @param numerator the numerator of the rational number
     * @param denominator the denominator of the rational number
     */
    public Rational(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }
    
    /**
     * reduces the rational number to its simpliest form
     */
    private void reduce() {
        int gcd = GCD(numerator, denominator);
        setNumerator(numerator/gcd);
        setDenominator(denominator/gcd);
    }
    
    /**
     * Finds the greatest common denominator of the rational number
     * 
     * @param numerator the numerator of the rational number
     * @param denominator the denominator of the rational number
     */
    private int GCD(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator;
        }
        return GCD(denominator,numerator%denominator);
    }
    
    /**
     * Gets the numerator of a rational number
     */
    public int getNumerator() {
        return numerator;
    }
    
    /**
     * Gets the denominator of a rational number
     */
    public int getDenominator() {
        return denominator;
    }
    
    /**
     * Sets the numerator of a rational number
     * 
     * @param numerator the numerator of the rational number
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    /**
     * Sets the denominator of a rational number
     * @param denominator the denominator of the rational number
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }
    
    /**
     * Replaces the equals method in Object so that rationals can be compared to see if they contain the same fraction
     * 
     * @param other the other rational number 
     */
    @Override
    public boolean equals(Object other) {
        Rational otherRational = (Rational) other;
        if (this.getNumerator() == otherRational.getNumerator() && this.getDenominator() == otherRational.getDenominator() ){
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Adds one rational number to another
     * 
     * @param other the other rational number
     */
    public Rational add(Rational other) {
        Rational answer = new Rational ();
        answer.setDenominator(this.getDenominator() * other.getDenominator());
        answer.setNumerator(this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator());
        answer.reduce();
        return answer;
    }
    
    /**
     * Subtracts one rational number from another
     * 
     * @param other the other rational number
     */
    public Rational subtract(Rational other) {
        Rational answer = new Rational ();
        other.setNumerator(-(other.getNumerator()));
        answer = add(other);
        return answer;
    }
    
    /**
     * Multiplies one rational number with another
     * 
     * @param other the other rational number
     */
    public Rational multiply(Rational other) {
        Rational answer = new Rational ();
        answer.setDenominator(this.getDenominator() * other.getDenominator());
        answer.setNumerator(this.getNumerator() * other.getNumerator());
        answer.reduce();
        return answer;
    }
    
    /**
     * Divides one rational number with another
     * 
     * @param other the other rational number
     */
    public Rational divide(Rational other) {
        Rational answer = new Rational ();
        int temp = other.getNumerator();
        other.setNumerator(other.getDenominator());
        other.setDenominator(temp);
        answer = multiply(other);
        return answer;
    }
}
