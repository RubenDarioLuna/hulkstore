package com.hulkstore.common.exceptions.jpa;

public class NotFoundException extends FindException
{
    public NotFoundException( Exception e, String str )
    {
        super( e, str );
    }
}
