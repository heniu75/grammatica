/*
 * RegexpTokenizer.java
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

import java.io.Reader;

import net.percederberg.grammatica.parser.ParserCreationException;
import net.percederberg.grammatica.parser.TokenPattern;
import net.percederberg.grammatica.parser.Tokenizer;

/**
 * A character stream tokenizer.
 * 
 * @author   Per Cederberg, <per at percederberg dot net>
 * @version  1.0
 */
class RegexpTokenizer extends Tokenizer {

    /**
     * Creates a new tokenizer for the specified input stream.
     * 
     * @param input          the input stream to read
     * 
     * @throws ParserCreationException if the tokenizer couldn't be
     *             initialized correctly
     */
    public RegexpTokenizer(Reader input)
        throws ParserCreationException {

        super(input);
        createPatterns();
    }

    /**
     * Initializes the tokenizer by creating all the token patterns.
     * 
     * @throws ParserCreationException if the tokenizer couldn't be
     *             initialized correctly
     */
    private void createPatterns() throws ParserCreationException {
        TokenPattern  pattern;

        pattern = new TokenPattern(RegexpConstants.LEFT_PAREN,
                                   "LEFT_PAREN",
                                   TokenPattern.STRING_TYPE,
                                   "(");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.RIGHT_PAREN,
                                   "RIGHT_PAREN",
                                   TokenPattern.STRING_TYPE,
                                   ")");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.LEFT_BRACKET,
                                   "LEFT_BRACKET",
                                   TokenPattern.STRING_TYPE,
                                   "[");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.RIGHT_BRACKET,
                                   "RIGHT_BRACKET",
                                   TokenPattern.STRING_TYPE,
                                   "]");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.LEFT_BRACE,
                                   "LEFT_BRACE",
                                   TokenPattern.STRING_TYPE,
                                   "{");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.RIGHT_BRACE,
                                   "RIGHT_BRACE",
                                   TokenPattern.STRING_TYPE,
                                   "}");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.QUESTION,
                                   "QUESTION",
                                   TokenPattern.STRING_TYPE,
                                   "?");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.ASTERISK,
                                   "ASTERISK",
                                   TokenPattern.STRING_TYPE,
                                   "*");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.PLUS,
                                   "PLUS",
                                   TokenPattern.STRING_TYPE,
                                   "+");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.VERTICAL_BAR,
                                   "VERTICAL_BAR",
                                   TokenPattern.STRING_TYPE,
                                   "|");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.DOT,
                                   "DOT",
                                   TokenPattern.STRING_TYPE,
                                   ".");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.COMMA,
                                   "COMMA",
                                   TokenPattern.STRING_TYPE,
                                   ",");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.NUMBER,
                                   "NUMBER",
                                   TokenPattern.REGEXP_TYPE,
                                   "[0-9]+");
        addPattern(pattern);

        pattern = new TokenPattern(RegexpConstants.CHAR,
                                   "CHAR",
                                   TokenPattern.REGEXP_TYPE,
                                   "(\\\\.)|.");
        addPattern(pattern);
    }
}
