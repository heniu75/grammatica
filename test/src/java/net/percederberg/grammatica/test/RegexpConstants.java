/*
 * RegexpConstants.java
 * 
 * THIS FILE HAS BEEN GENERATED AUTOMATICALLY. DO NOT EDIT!
 * 
 * This work is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 * 
 * This work is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 * 
 * As a special exception, the copyright holders of this library give
 * you permission to link this library with independent modules to
 * produce an executable, regardless of the license terms of these
 * independent modules, and to copy and distribute the resulting
 * executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the
 * license of that module. An independent module is a module which is
 * not derived from or based on this library. If you modify this
 * library, you may extend this exception to your version of the
 * library, but you are not obligated to do so. If you do not wish to
 * do so, delete this exception statement from your version.
 * 
 * Copyright (c) 2003 Per Cederberg. All rights reserved.
 */

package net.percederberg.grammatica.test;

/**
 * An interface with constants for the parser and tokenizer.
 * 
 * @author   Per Cederberg, <per at percederberg dot net>
 * @version  1.0
 */
interface RegexpConstants {

    /**
     * A token identity constant.
     */
    public static final int LEFT_PAREN = 1001;

    /**
     * A token identity constant.
     */
    public static final int RIGHT_PAREN = 1002;

    /**
     * A token identity constant.
     */
    public static final int LEFT_BRACKET = 1003;

    /**
     * A token identity constant.
     */
    public static final int RIGHT_BRACKET = 1004;

    /**
     * A token identity constant.
     */
    public static final int LEFT_BRACE = 1005;

    /**
     * A token identity constant.
     */
    public static final int RIGHT_BRACE = 1006;

    /**
     * A token identity constant.
     */
    public static final int QUESTION = 1007;

    /**
     * A token identity constant.
     */
    public static final int ASTERISK = 1008;

    /**
     * A token identity constant.
     */
    public static final int PLUS = 1009;

    /**
     * A token identity constant.
     */
    public static final int VERTICAL_BAR = 1010;

    /**
     * A token identity constant.
     */
    public static final int DOT = 1011;

    /**
     * A token identity constant.
     */
    public static final int COMMA = 1012;

    /**
     * A token identity constant.
     */
    public static final int NUMBER = 1013;

    /**
     * A token identity constant.
     */
    public static final int CHAR = 1014;

    /**
     * A production node identity constant.
     */
    public static final int EXPR = 2001;

    /**
     * A production node identity constant.
     */
    public static final int TERM = 2002;

    /**
     * A production node identity constant.
     */
    public static final int FACT = 2003;

    /**
     * A production node identity constant.
     */
    public static final int ATOM = 2004;

    /**
     * A production node identity constant.
     */
    public static final int ATOM_MODIFIER = 2005;

    /**
     * A production node identity constant.
     */
    public static final int CHARACTER_SET = 2006;

    /**
     * A production node identity constant.
     */
    public static final int CHARACTER = 2007;
}
