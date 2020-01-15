/*
 * Copyright (c) 2011 - 2020, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.turbinemaintenance;


import com.apiomat.nativemodule.basics.*;
/**
* Generated class for your Windpark data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "TurbineMaintenance",
    hooksClassNameTransient = "com.apiomat.nativemodule.turbinemaintenance.WindparkHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.turbinemaintenance.WindparkHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class Windpark extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.turbinemaintenance.Windpark> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.turbinemaintenance.Windpark>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "TurbineMaintenance";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Windpark";

    /** class specific attributes */
    private Double currentTemp = null;
    private Long currentWindSpeed = null;
    private double[] geoLocation;
    private String name = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Windpark ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public Double getCurrentTemp()
    {
         return this.currentTemp;
    }

    public void setCurrentTemp( Double arg )
    {
        this.currentTemp = arg;
    }

    public Long getCurrentWindSpeed()
    {
         return this.currentWindSpeed;
    }

    public void setCurrentWindSpeed( Long arg )
    {
        this.currentWindSpeed = arg;
    }

    public double getGeoLocationLatitude( )
    {
         return this.geoLocation !=null && this.geoLocation.length > 0 ? this.geoLocation[0] : 0;
    }

    public double getGeoLocationLongitude( )
    {
         return this.geoLocation !=null && this.geoLocation.length > 1 ? this.geoLocation[1] : 0;
    }

    public void setGeoLocationLatitude( double latitude )
    {
        if( this.geoLocation == null )
        {
            this.geoLocation = new double[]{};
        }

        if ( this.geoLocation.length < 2 )
        {
            this.geoLocation = new double[]{ latitude, 0 };
        }
        else
        {
            this.geoLocation[0] = latitude;
        }
    }

    public void setGeoLocationLongitude( double longitude )
    {
        if( this.geoLocation == null )
        {
            this.geoLocation = new double[]{};
        }

        if ( this.geoLocation.length < 2 )
        {
            this.geoLocation = new double[]{ 0, longitude };
        }
        else
        {
            this.geoLocation[1] = longitude;
        }
    }

    public String getName()
    {
         return this.name;
    }

    public void setName( String arg )
    {
        this.name = arg;
    }

}
