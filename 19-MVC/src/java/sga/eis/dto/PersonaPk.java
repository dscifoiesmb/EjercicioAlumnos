/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */
package sga.eis.dto;

import java.io.Serializable;

/**
 * This class represents the primary key of the persona table.
 */
public class PersonaPk implements Serializable {

    protected Integer idPersona;

    /**
     * Sets the value of idPersona
     */
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * Gets the value of idPersona
     */
    public Integer getIdPersona() {
        return idPersona;
    }

    /**
     * Method 'PersonaPk'
     *
     */
    public PersonaPk() {
    }

    /**
     * Method 'PersonaPk'
     *
     * @param idPersona
     */
    public PersonaPk(final Integer idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * Method 'equals'
     *
     * @param _other
     * @return boolean
     */
    public boolean equals(Object _other) {
        if (_other == null) {
            return false;
        }

        if (_other == this) {
            return true;
        }

        if (!(_other instanceof PersonaPk)) {
            return false;
        }

        final PersonaPk _cast = (PersonaPk) _other;
        if (idPersona == null ? _cast.idPersona != idPersona : !idPersona.equals(_cast.idPersona)) {
            return false;
        }

        return true;
    }

    /**
     * Method 'hashCode'
     *
     * @return int
     */
    public int hashCode() {
        int _hashCode = 0;
        if (idPersona != null) {
            _hashCode = 29 * _hashCode + idPersona.hashCode();
        }

        return _hashCode;
    }

    /**
     * Method 'toString'
     *
     * @return String
     */
    public String toString() {
        StringBuffer ret = new StringBuffer();
        ret.append("ap.eis.dto.PersonaPk: ");
        ret.append("idPersona=" + idPersona);
        return ret.toString();
    }

}