/*******************************************************************************
 * Copyright (c) 2016 Prowide Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as 
 *     published by the Free Software Foundation, either version 3 of the 
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 *     
 *     Check the LGPL at <http://www.gnu.org/licenses/> for more details.
 *******************************************************************************/
package com.prowidesoftware.swift.model.mt.mt3xx;



import com.prowidesoftware.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.internal.*;
import com.prowidesoftware.swift.internal.SequenceStyle.Type;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.utils.Lib;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;

/**
 * <h1>MT 341 - Forward Rate Agreement Settlement Confirmation</h1>
 * <h3>SWIFT MT341 (ISO 15022) message structure:</h3>
 *
 <div class="scheme"><ul>
<li class="sequence">
Sequence A (M)<ul><li class="field">Field 15 A (M)</li>
<li class="field">Field 20  (M)</li>
<li class="field">Field 21  (O)</li>
<li class="field">Field 22 A (M)</li>
<li class="field">Field 94 A (O)</li>
<li class="field">Field 22 C (M)</li>
<li class="field">Field 23 D (M)</li>
<li class="field">Field 21 N (O)</li>
<li class="field">Field 21 B (O)</li>
<li class="field">Field 82 A,D (M)</li>
<li class="field">Field 87 A,D (M)</li>
<li class="field">Field 29 A (O)</li>
<li class="field">Field 72  (O)</li>
</ul></li>
<li class="sequence">
Sequence B (M)<ul><li class="field">Field 15 B (M)</li>
<li class="field">Field 30 T (M)</li>
<li class="field">Field 32 B (M)</li>
<li class="field">Field 30 F (M)</li>
<li class="field">Field 30 P (M)</li>
<li class="field">Field 37 M (M)</li>
<li class="sequence">
Sequence B1 (O)<ul><li class="field">Field 30 V (O)</li>
<li class="field">Field 38 D (O)</li>
</ul></li>
</ul></li>
<li class="sequence">
Sequence C (M)<ul><li class="field">Field 15 C (M)</li>
<li class="field">Field 37 R (M)</li>
<li class="field">Field 34 E (M)</li>
<li class="field">Field 53 A,D,J (O)</li>
<li class="field">Field 86 A,D,J (O)</li>
<li class="field">Field 56 A,D,J (O)</li>
<li class="field">Field 57 A,D,J (M)</li>
<li class="field">Field 58 A,D,J (O)</li>
</ul></li>
<li class="sequence">
Sequence D (O)<ul><li class="field">Field 15 D (M)</li>
<li class="sequence">
Sequence D1 (O) (repetitive)<ul><li class="field">Field 22 L (M)</li>
<li class="field">Field 91 A,D,J (O)</li>
<li class="sequence">
Sequence D1a (O) (repetitive)<ul><li class="field">Field 22 M (M)</li>
<li class="field">Field 22 N (M)</li>
<li class="sequence">
Sequence D1a1 (O) (repetitive)<ul><li class="field">Field 22 P (M)</li>
<li class="field">Field 22 R (M)</li>
</ul></li>
</ul></li>
</ul></li>
<li class="field">Field 96 A,D,J (O)</li>
<li class="field">Field 22 S (O) (repetitive)</li>
<li class="field">Field 22 T (O)</li>
<li class="field">Field 17 E (O)</li>
<li class="field">Field 22 U (O)</li>
<li class="field">Field 35 B (O)</li>
<li class="field">Field 17 H (O)</li>
<li class="field">Field 17 P (O)</li>
<li class="field">Field 22 V (O)</li>
<li class="field">Field 98 D (O)</li>
<li class="field">Field 17 W (O)</li>
<li class="field">Field 17 Y (O)</li>
<li class="field">Field 17 Z (O)</li>
<li class="field">Field 22 Q (O)</li>
<li class="field">Field 17 L (O)</li>
<li class="field">Field 17 M (O)</li>
<li class="field">Field 17 Q (O)</li>
<li class="field">Field 17 S (O)</li>
<li class="field">Field 17 X (O)</li>
<li class="field">Field 77 A (O)</li>
</ul></li>
</ul></div>

 <style>
.scheme, .scheme ul, .scheme li {
     position: relative;
}
.scheme ul {
    list-style: none;
    padding-left: 32px;
}
.scheme li::before, .scheme li::after {
    content: "";
    position: absolute;
    left: -12px;
}
.scheme li::before {
    border-top: 1px solid #000;
    top: 9px;
    width: 8px;
    height: 0;
}
.scheme li::after {
    border-left: 1px solid #000;
    height: 100%;
    width: 0px;
    top: 2px;
}
.scheme ul > li:last-child::after {
    height: 8px;
}</style>

 *
 * <p>This source code is specific to release <strong>SRU 2017</strong></p> 
 * <p>For additional resources check <a href="http://www.prowidesoftware.com/resources">http://www.prowidesoftware.com/resources</a></p>
 *
 * @author www.prowidesoftware.com
 */
@Generated
public class MT341 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2017;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT341.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "341";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value A 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsA.A
	* @see com.prowidesoftware.swift.SchemeConstantsA#A
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String A = "A";

	/**
	* Constant for qualifier with value AGNT 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsA.AGNT
	* @see com.prowidesoftware.swift.SchemeConstantsA#AGNT
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String AGNT = "AGNT";

	/**
	* Constant for qualifier with value AMND 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsA.AMND
	* @see com.prowidesoftware.swift.SchemeConstantsA#AMND
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String AMND = "AMND";

	/**
	* Constant for qualifier with value BILA 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsB.BILA
	* @see com.prowidesoftware.swift.SchemeConstantsB#BILA
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String BILA = "BILA";

	/**
	* Constant for qualifier with value C 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.C
	* @see com.prowidesoftware.swift.SchemeConstantsC#C
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String C = "C";

	/**
	* Constant for qualifier with value CANC 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsC.CANC
	* @see com.prowidesoftware.swift.SchemeConstantsC#CANC
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String CANC = "CANC";

	/**
	* Constant for qualifier with value F 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.F
	* @see com.prowidesoftware.swift.SchemeConstantsF#F
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String F = "F";

	/**
	* Constant for qualifier with value FIXEDFLOAT 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FIXEDFLOAT
	* @see com.prowidesoftware.swift.SchemeConstantsF#FIXEDFLOAT
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FIXEDFLOAT = "FIXEDFLOAT";

	/**
	* Constant for qualifier with value FLOATFIXED 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsF.FLOATFIXED
	* @see com.prowidesoftware.swift.SchemeConstantsF#FLOATFIXED
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String FLOATFIXED = "FLOATFIXED";

	/**
	* Constant for qualifier with value N 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsN.N
	* @see com.prowidesoftware.swift.SchemeConstantsN#N
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String N = "N";

	/**
	* Constant for qualifier with value O 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsO.O
	* @see com.prowidesoftware.swift.SchemeConstantsO#O
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String O = "O";

	/**
	* Constant for qualifier with value P 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsP.P
	* @see com.prowidesoftware.swift.SchemeConstantsP#P
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String P = "P";

	/**
	* Constant for qualifier with value SETT 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsS.SETT
	* @see com.prowidesoftware.swift.SchemeConstantsS#SETT
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String SETT = "SETT";

	/**
	* Constant for qualifier with value U 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsU.U
	* @see com.prowidesoftware.swift.SchemeConstantsU#U
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String U = "U";

	/**
	* Constant for qualifier with value Y 
	* @deprecated use instead com.prowidesoftware.swift.SchemeConstantsY.Y
	* @see com.prowidesoftware.swift.SchemeConstantsY#Y
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public static final String Y = "Y";

// end qualifiers constants	

	/**
	 * Creates an MT341 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT341 content
	 */
	public MT341(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT341 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT341 content, the parameter can not be <code>null</code>
	 * @see #MT341(String)
	 */
	public MT341(MtSwiftMessage m) {
		this();
		super.m = super.getSwiftMessageNotNullOrException();
		sanityCheck(super.m);
	}
	
	/**
	 * Creates an MT341 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT341 content
	 * @return the created object or <code>null</code> if the parameter is <code>null</code>
	 * @see #MT341(String)
	 * @since 7.7
	 */
	public static MT341 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT341(m.message());
	}
	
	/**
	 * Creates and initializes a new MT341 input message setting TEST BICS as sender and receiver.<br />
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT341() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT341 input message from sender to receiver.<br />
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT341(final String sender, final String receiver) {
		super(341, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	* 
	* @see #MT341(String, String)
	* @deprecated Use instead <code>new MT341(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.prowidesoftware.deprecation.ProwideDeprecated(phase3=com.prowidesoftware.deprecation.TargetYear._2018)
	public MT341(final int messageType, final String sender, final String receiver) {
		super(341, sender, receiver);
		com.prowidesoftware.deprecation.DeprecationUtils.phase2(getClass(), "MT341(int, String, String)", "Use the constructor MT341(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT341 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT341(final String fin) {
		super();
		if (fin != null) {
			final SwiftMessage parsed = read(fin);
			if (parsed != null) {
				super.m = parsed;
				sanityCheck(parsed);
			}
		}
    }
    
    private void sanityCheck(final SwiftMessage param) {
    	if (param.isServiceMessage()) {
			log.warning("Creating an MT341 object from FIN content with a Service Message. Check if the MT341 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT341 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT341 by parsing a String with the message content in its swift FIN format.<br />
	 * If the fin parameter cannot be parsed, the returned MT341 will have its internal message object
	 * initialized (blocks will be created) but empty.<br />
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be <code>null</code> in which case this method returns null</em>
	 * @return a new instance of MT341 or null if fin is null 
	 * @since 7.7
	 */
	public static MT341 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT341(fin);
    }
    
    /**
	 * Creates a new MT341 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT341(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT341 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br />
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT341 or null if stream is null or the message cannot be parsed 
	 * @since 7.7
	 */
	public static MT341 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT341(stream);
    }
    
    /**
	 * Creates a new MT341 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @since 7.7
	 */
	public MT341(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT341 by parsing a file with the message content in its swift FIN format.<br />
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT341 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @since 7.7
	 */
	public static MT341 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT341(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "341";
	}
	
	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT341 append(final SwiftTagListBlock block) {
		super.append(block);
		return this;
	}
	
	/**
	 * Add all tags to the end of the block4.
	 *
	 * @param tags to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT341 append(final Tag ... tags) {
		super.append(tags);
		return this;
	}
	
	/**
	 * Add all the fields to the end of the block4.
	 *
	 * @param fields to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT341 append(final Field ... fields) {
		super.append(fields);
		return this;
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15A at MT341 is expected to be the only one.
	 * 
	 * @return a Field15A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15A getField15A() {
		final Tag t = tag("15A");
		if (t != null) {
			return new Field15A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 20 at MT341 is expected to be the only one.
	 * 
	 * @return a Field20 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field20 getField20() {
		final Tag t = tag("20");
		if (t != null) {
			return new Field20(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21 at MT341 is expected to be the only one.
	 * 
	 * @return a Field21 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21 getField21() {
		final Tag t = tag("21");
		if (t != null) {
			return new Field21(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22A at MT341 is expected to be the only one.
	 * 
	 * @return a Field22A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22A getField22A() {
		final Tag t = tag("22A");
		if (t != null) {
			return new Field22A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 94A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 94A at MT341 is expected to be the only one.
	 * 
	 * @return a Field94A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field94A getField94A() {
		final Tag t = tag("94A");
		if (t != null) {
			return new Field94A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22C at MT341 is expected to be the only one.
	 * 
	 * @return a Field22C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22C getField22C() {
		final Tag t = tag("22C");
		if (t != null) {
			return new Field22C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 23D at MT341 is expected to be the only one.
	 * 
	 * @return a Field23D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23D getField23D() {
		final Tag t = tag("23D");
		if (t != null) {
			return new Field23D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21N, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21N at MT341 is expected to be the only one.
	 * 
	 * @return a Field21N object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21N getField21N() {
		final Tag t = tag("21N");
		if (t != null) {
			return new Field21N(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 21B at MT341 is expected to be the only one.
	 * 
	 * @return a Field21B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21B getField21B() {
		final Tag t = tag("21B");
		if (t != null) {
			return new Field21B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 82A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 82A at MT341 is expected to be the only one.
	 * 
	 * @return a Field82A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field82A getField82A() {
		final Tag t = tag("82A");
		if (t != null) {
			return new Field82A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 82D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 82D at MT341 is expected to be the only one.
	 * 
	 * @return a Field82D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field82D getField82D() {
		final Tag t = tag("82D");
		if (t != null) {
			return new Field82D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 87A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 87A at MT341 is expected to be the only one.
	 * 
	 * @return a Field87A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field87A getField87A() {
		final Tag t = tag("87A");
		if (t != null) {
			return new Field87A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 87D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 87D at MT341 is expected to be the only one.
	 * 
	 * @return a Field87D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field87D getField87D() {
		final Tag t = tag("87D");
		if (t != null) {
			return new Field87D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 29A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 29A at MT341 is expected to be the only one.
	 * 
	 * @return a Field29A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field29A getField29A() {
		final Tag t = tag("29A");
		if (t != null) {
			return new Field29A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 72, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 72 at MT341 is expected to be the only one.
	 * 
	 * @return a Field72 object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field72 getField72() {
		final Tag t = tag("72");
		if (t != null) {
			return new Field72(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15B at MT341 is expected to be the only one.
	 * 
	 * @return a Field15B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15B getField15B() {
		final Tag t = tag("15B");
		if (t != null) {
			return new Field15B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30T, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30T at MT341 is expected to be the only one.
	 * 
	 * @return a Field30T object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30T getField30T() {
		final Tag t = tag("30T");
		if (t != null) {
			return new Field30T(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 32B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 32B at MT341 is expected to be the only one.
	 * 
	 * @return a Field32B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field32B getField32B() {
		final Tag t = tag("32B");
		if (t != null) {
			return new Field32B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30F, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30F at MT341 is expected to be the only one.
	 * 
	 * @return a Field30F object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30F getField30F() {
		final Tag t = tag("30F");
		if (t != null) {
			return new Field30F(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30P, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30P at MT341 is expected to be the only one.
	 * 
	 * @return a Field30P object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30P getField30P() {
		final Tag t = tag("30P");
		if (t != null) {
			return new Field30P(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 37M, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 37M at MT341 is expected to be the only one.
	 * 
	 * @return a Field37M object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field37M getField37M() {
		final Tag t = tag("37M");
		if (t != null) {
			return new Field37M(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 30V, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 30V at MT341 is expected to be the only one.
	 * 
	 * @return a Field30V object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30V getField30V() {
		final Tag t = tag("30V");
		if (t != null) {
			return new Field30V(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 38D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 38D at MT341 is expected to be the only one.
	 * 
	 * @return a Field38D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field38D getField38D() {
		final Tag t = tag("38D");
		if (t != null) {
			return new Field38D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15C, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15C at MT341 is expected to be the only one.
	 * 
	 * @return a Field15C object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15C getField15C() {
		final Tag t = tag("15C");
		if (t != null) {
			return new Field15C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 37R, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 37R at MT341 is expected to be the only one.
	 * 
	 * @return a Field37R object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field37R getField37R() {
		final Tag t = tag("37R");
		if (t != null) {
			return new Field37R(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 34E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 34E at MT341 is expected to be the only one.
	 * 
	 * @return a Field34E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field34E getField34E() {
		final Tag t = tag("34E");
		if (t != null) {
			return new Field34E(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53A at MT341 is expected to be the only one.
	 * 
	 * @return a Field53A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53A getField53A() {
		final Tag t = tag("53A");
		if (t != null) {
			return new Field53A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53D at MT341 is expected to be the only one.
	 * 
	 * @return a Field53D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53D getField53D() {
		final Tag t = tag("53D");
		if (t != null) {
			return new Field53D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 53J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 53J at MT341 is expected to be the only one.
	 * 
	 * @return a Field53J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field53J getField53J() {
		final Tag t = tag("53J");
		if (t != null) {
			return new Field53J(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 86A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 86A at MT341 is expected to be the only one.
	 * 
	 * @return a Field86A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field86A getField86A() {
		final Tag t = tag("86A");
		if (t != null) {
			return new Field86A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 86D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 86D at MT341 is expected to be the only one.
	 * 
	 * @return a Field86D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field86D getField86D() {
		final Tag t = tag("86D");
		if (t != null) {
			return new Field86D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 86J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 86J at MT341 is expected to be the only one.
	 * 
	 * @return a Field86J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field86J getField86J() {
		final Tag t = tag("86J");
		if (t != null) {
			return new Field86J(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 56A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 56A at MT341 is expected to be the only one.
	 * 
	 * @return a Field56A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field56A getField56A() {
		final Tag t = tag("56A");
		if (t != null) {
			return new Field56A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 56D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 56D at MT341 is expected to be the only one.
	 * 
	 * @return a Field56D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field56D getField56D() {
		final Tag t = tag("56D");
		if (t != null) {
			return new Field56D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 56J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 56J at MT341 is expected to be the only one.
	 * 
	 * @return a Field56J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field56J getField56J() {
		final Tag t = tag("56J");
		if (t != null) {
			return new Field56J(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57A at MT341 is expected to be the only one.
	 * 
	 * @return a Field57A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57A getField57A() {
		final Tag t = tag("57A");
		if (t != null) {
			return new Field57A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57D at MT341 is expected to be the only one.
	 * 
	 * @return a Field57D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57D getField57D() {
		final Tag t = tag("57D");
		if (t != null) {
			return new Field57D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 57J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 57J at MT341 is expected to be the only one.
	 * 
	 * @return a Field57J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field57J getField57J() {
		final Tag t = tag("57J");
		if (t != null) {
			return new Field57J(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 58A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 58A at MT341 is expected to be the only one.
	 * 
	 * @return a Field58A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field58A getField58A() {
		final Tag t = tag("58A");
		if (t != null) {
			return new Field58A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 58D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 58D at MT341 is expected to be the only one.
	 * 
	 * @return a Field58D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field58D getField58D() {
		final Tag t = tag("58D");
		if (t != null) {
			return new Field58D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 58J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 58J at MT341 is expected to be the only one.
	 * 
	 * @return a Field58J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field58J getField58J() {
		final Tag t = tag("58J");
		if (t != null) {
			return new Field58J(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 15D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 15D at MT341 is expected to be the only one.
	 * 
	 * @return a Field15D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field15D getField15D() {
		final Tag t = tag("15D");
		if (t != null) {
			return new Field15D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 96A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 96A at MT341 is expected to be the only one.
	 * 
	 * @return a Field96A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field96A getField96A() {
		final Tag t = tag("96A");
		if (t != null) {
			return new Field96A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 96D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 96D at MT341 is expected to be the only one.
	 * 
	 * @return a Field96D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field96D getField96D() {
		final Tag t = tag("96D");
		if (t != null) {
			return new Field96D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 96J, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 96J at MT341 is expected to be the only one.
	 * 
	 * @return a Field96J object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field96J getField96J() {
		final Tag t = tag("96J");
		if (t != null) {
			return new Field96J(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22T, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22T at MT341 is expected to be the only one.
	 * 
	 * @return a Field22T object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22T getField22T() {
		final Tag t = tag("22T");
		if (t != null) {
			return new Field22T(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17E, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17E at MT341 is expected to be the only one.
	 * 
	 * @return a Field17E object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17E getField17E() {
		final Tag t = tag("17E");
		if (t != null) {
			return new Field17E(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22U, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22U at MT341 is expected to be the only one.
	 * 
	 * @return a Field22U object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22U getField22U() {
		final Tag t = tag("22U");
		if (t != null) {
			return new Field22U(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 35B, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 35B at MT341 is expected to be the only one.
	 * 
	 * @return a Field35B object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field35B getField35B() {
		final Tag t = tag("35B");
		if (t != null) {
			return new Field35B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17H, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17H at MT341 is expected to be the only one.
	 * 
	 * @return a Field17H object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17H getField17H() {
		final Tag t = tag("17H");
		if (t != null) {
			return new Field17H(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17P, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17P at MT341 is expected to be the only one.
	 * 
	 * @return a Field17P object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17P getField17P() {
		final Tag t = tag("17P");
		if (t != null) {
			return new Field17P(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22V, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22V at MT341 is expected to be the only one.
	 * 
	 * @return a Field22V object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22V getField22V() {
		final Tag t = tag("22V");
		if (t != null) {
			return new Field22V(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 98D, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 98D at MT341 is expected to be the only one.
	 * 
	 * @return a Field98D object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98D getField98D() {
		final Tag t = tag("98D");
		if (t != null) {
			return new Field98D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17W, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17W at MT341 is expected to be the only one.
	 * 
	 * @return a Field17W object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17W getField17W() {
		final Tag t = tag("17W");
		if (t != null) {
			return new Field17W(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17Y, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17Y at MT341 is expected to be the only one.
	 * 
	 * @return a Field17Y object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17Y getField17Y() {
		final Tag t = tag("17Y");
		if (t != null) {
			return new Field17Y(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17Z, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17Z at MT341 is expected to be the only one.
	 * 
	 * @return a Field17Z object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17Z getField17Z() {
		final Tag t = tag("17Z");
		if (t != null) {
			return new Field17Z(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 22Q, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 22Q at MT341 is expected to be the only one.
	 * 
	 * @return a Field22Q object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field22Q getField22Q() {
		final Tag t = tag("22Q");
		if (t != null) {
			return new Field22Q(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17L, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17L at MT341 is expected to be the only one.
	 * 
	 * @return a Field17L object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17L getField17L() {
		final Tag t = tag("17L");
		if (t != null) {
			return new Field17L(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17M, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17M at MT341 is expected to be the only one.
	 * 
	 * @return a Field17M object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17M getField17M() {
		final Tag t = tag("17M");
		if (t != null) {
			return new Field17M(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17Q, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17Q at MT341 is expected to be the only one.
	 * 
	 * @return a Field17Q object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17Q getField17Q() {
		final Tag t = tag("17Q");
		if (t != null) {
			return new Field17Q(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17S, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17S at MT341 is expected to be the only one.
	 * 
	 * @return a Field17S object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17S getField17S() {
		final Tag t = tag("17S");
		if (t != null) {
			return new Field17S(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 17X, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 17X at MT341 is expected to be the only one.
	 * 
	 * @return a Field17X object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field17X getField17X() {
		final Tag t = tag("17X");
		if (t != null) {
			return new Field17X(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 77A, 
	 * or <code>null</code> if none is found.<br />
	 * The first occurrence of field 77A at MT341 is expected to be the only one.
	 * 
	 * @return a Field77A object or <code>null</code> if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field77A getField77A() {
		final Tag t = tag("77A");
		if (t != null) {
			return new Field77A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22L at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22L> getField22L() {
		final List<Field22L> result = new ArrayList<Field22L>();
		final Tag[] tags = tags("22L");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field22L(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 91A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 91A at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field91A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field91A> getField91A() {
		final List<Field91A> result = new ArrayList<Field91A>();
		final Tag[] tags = tags("91A");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field91A(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 91D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 91D at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field91D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field91D> getField91D() {
		final List<Field91D> result = new ArrayList<Field91D>();
		final Tag[] tags = tags("91D");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field91D(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 91J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 91J at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field91J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field91J> getField91J() {
		final List<Field91J> result = new ArrayList<Field91J>();
		final Tag[] tags = tags("91J");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field91J(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22M, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22M at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22M objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22M> getField22M() {
		final List<Field22M> result = new ArrayList<Field22M>();
		final Tag[] tags = tags("22M");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field22M(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22N, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22N at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22N objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22N> getField22N() {
		final List<Field22N> result = new ArrayList<Field22N>();
		final Tag[] tags = tags("22N");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field22N(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22P at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22P objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22P> getField22P() {
		final List<Field22P> result = new ArrayList<Field22P>();
		final Tag[] tags = tags("22P");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field22P(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22R at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22R> getField22R() {
		final List<Field22R> result = new ArrayList<Field22R>();
		final Tag[] tags = tags("22R");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field22R(tags[i].getValue()));
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br />
	 * Multiple occurrences of field 22S at MT341 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22S> getField22S() {
		final List<Field22S> result = new ArrayList<Field22S>();
		final Tag[] tags = tags("22S");
		for (int i=0; i<tags.length; i++) {
			result.add(new Field22S(tags[i].getValue()));
		}
		return result;
	}
	

// BaseSequenceCodeGenerator [seq=A]
	/**
	* Class for Sequence "A" of MT 341
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public static class SequenceA extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceA() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceA(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		public static final Tag START_TAG = Field15A.emptyTag();
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		* @since 7.7
		*/
		@SequenceStyle(Type.SPLIT_BY_15)
		public static SequenceA newInstance(final Tag ... tags) {
			final SequenceA result = new SequenceA();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}


			return result;
		}
		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.7
		*/
		public static SequenceA newInstance() {
			final SequenceA result = new SequenceA();

			result.append(START_TAG);

			return result;
		}
		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.7
		*/
		public static SequenceA newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceA result = new SequenceA();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			return result;

		}


	}
	/**
	* Get the single occurrence of SequenceA using field field 15 as sequence boundary.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* 
	* @since 7.7
	* @return a new sequence that may be empty, <em>never returns null</em>
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public SequenceA getSequenceA() {
		return getSequenceA(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	
	/**
	* Get the single occurrence of SequenceA using field field 15 as sequence boundary.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceA within the complete message
	* @since 7.7
	* @return a new sequence that may be empty, <em>never returns null</em>
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public SequenceA getSequenceA(SwiftTagListBlock parentSequence) {
		final java.util.Map<String, SwiftTagListBlock> map = SwiftMessageUtils.splitByField15(parentSequence);
		if (map.containsKey("A")) {
			return new SequenceA(map.get("A"));
		}
		return new SequenceA();
	}


// BaseSequenceCodeGenerator [seq=B]
	/**
	* Class for Sequence "B" of MT 341
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public static class SequenceB extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceB() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceB(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		public static final Tag START_TAG = Field15B.emptyTag();
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		* @since 7.7
		*/
		@SequenceStyle(Type.SPLIT_BY_15)
		public static SequenceB newInstance(final Tag ... tags) {
			final SequenceB result = new SequenceB();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}


			return result;
		}
		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.7
		*/
		public static SequenceB newInstance() {
			final SequenceB result = new SequenceB();

			result.append(START_TAG);

			return result;
		}
		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.7
		*/
		public static SequenceB newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB result = new SequenceB();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			return result;

		}


	}
	/**
	* Get the single occurrence of SequenceB using field field 15 as sequence boundary.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* 
	* @since 7.7
	* @return a new sequence that may be empty, <em>never returns null</em>
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public SequenceB getSequenceB() {
		return getSequenceB(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	
	/**
	* Get the single occurrence of SequenceB using field field 15 as sequence boundary.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceB within the complete message
	* @since 7.7
	* @return a new sequence that may be empty, <em>never returns null</em>
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public SequenceB getSequenceB(SwiftTagListBlock parentSequence) {
		final java.util.Map<String, SwiftTagListBlock> map = SwiftMessageUtils.splitByField15(parentSequence);
		if (map.containsKey("B")) {
			return new SequenceB(map.get("B"));
		}
		return new SequenceB();
	}


// BaseSequenceCodeGenerator [seq=C]
	/**
	* Class for Sequence "C" of MT 341
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public static class SequenceC extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceC() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceC(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		public static final Tag START_TAG = Field15C.emptyTag();
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		* @since 7.7
		*/
		@SequenceStyle(Type.SPLIT_BY_15)
		public static SequenceC newInstance(final Tag ... tags) {
			final SequenceC result = new SequenceC();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}


			return result;
		}
		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.7
		*/
		public static SequenceC newInstance() {
			final SequenceC result = new SequenceC();

			result.append(START_TAG);

			return result;
		}
		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.7
		*/
		public static SequenceC newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC result = new SequenceC();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			return result;

		}


	}
	/**
	* Get the single occurrence of SequenceC using field field 15 as sequence boundary.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* 
	* @since 7.7
	* @return a new sequence that may be empty, <em>never returns null</em>
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public SequenceC getSequenceC() {
		return getSequenceC(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	
	/**
	* Get the single occurrence of SequenceC using field field 15 as sequence boundary.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceC within the complete message
	* @since 7.7
	* @return a new sequence that may be empty, <em>never returns null</em>
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public SequenceC getSequenceC(SwiftTagListBlock parentSequence) {
		final java.util.Map<String, SwiftTagListBlock> map = SwiftMessageUtils.splitByField15(parentSequence);
		if (map.containsKey("C")) {
			return new SequenceC(map.get("C"));
		}
		return new SequenceC();
	}


// BaseSequenceCodeGenerator [seq=D]
	/**
	* Class for Sequence "D" of MT 341
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public static class SequenceD extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		public static final Tag START_TAG = Field15D.emptyTag();
		/**
		* Creates a new instance of this sequence with the given tags inside.
		* @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		* @since 7.7
		*/
		@SequenceStyle(Type.SPLIT_BY_15)
		public static SequenceD newInstance(final Tag ... tags) {
			final SequenceD result = new SequenceD();

			result.append(START_TAG);

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}


			return result;
		}
		/**
		* Create an empty $sequenceClassname.
		* This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		* @since 7.7
		*/
		public static SequenceD newInstance() {
			final SequenceD result = new SequenceD();

			result.append(START_TAG);

			return result;
		}
		/**
		* Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		* Mainly intended to create a sequence by adding subsequences
		* @since 7.7
		*/
		public static SequenceD newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceD result = new SequenceD();

			result.append(START_TAG);

			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}

			return result;

		}


	}
	/**
	* Get the single occurrence of SequenceD using field field 15 as sequence boundary.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* 
	* @since 7.7
	* @return a new sequence that may be empty, <em>never returns null</em>
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public SequenceD getSequenceD() {
		return getSequenceD(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	
	/**
	* Get the single occurrence of SequenceD using field field 15 as sequence boundary.
	* The presence of this methods indicates that this sequence can occur only once according to the Standard.
	* 
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceD within the complete message
	* @since 7.7
	* @return a new sequence that may be empty, <em>never returns null</em>
	*/
	@SequenceStyle(Type.SPLIT_BY_15)
	public SequenceD getSequenceD(SwiftTagListBlock parentSequence) {
		final java.util.Map<String, SwiftTagListBlock> map = SwiftMessageUtils.splitByField15(parentSequence);
		if (map.containsKey("D")) {
			return new SequenceD(map.get("D"));
		}
		return new SequenceD();
	}


// BaseSequenceCodeGenerator [seq=D1]
	/**
	* Class for Sequence "D1" of MT 341
	*/
	public static class SequenceD1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* tagname of the first tag in the sequence which must be mandatory.
		* may be null if we cannot determine this safely
		*/
		public static final String START_NAME =  "22L"  ;
	}


// BaseSequenceCodeGenerator [seq=D1a]
	/**
	* Class for Sequence "D1a" of MT 341
	*/
	public static class SequenceD1a extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD1a() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD1a(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"22M"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "22M"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"22N"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		protected static final String[] END = { "22N"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		protected static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		@SequenceStyle(Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL)
		public static SequenceD1a newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		@SequenceStyle(Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL)
		public static SequenceD1a newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceD1a result = new SequenceD1a();

			result.append(new Tag(START[start], ""));

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(new Tag(END[end], ""));

			return result;
		}
	}
	/**
	* Get the list of SequenceD1a delimited by leading tag and end, with an optional tail.
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SwiftTagListBlock#getSubBlocksDelimitedWithOptionalTail(String[], String[], String[])
	*/
	@SequenceStyle(Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL)
	public List<SequenceD1a> getSequenceD1aList() {
		return getSequenceD1aList(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	
	/**
	* Get the list of SequenceD1a delimited by leading tag and end, with an optional tail.
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SwiftTagListBlock#getSubBlocksDelimitedWithOptionalTail(String[], String[], String[])
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceD1a within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL)
	public static List<SequenceD1a> getSequenceD1aList(final SwiftTagListBlock parentSequence) {
		if (parentSequence != null && !parentSequence.isEmpty()) {
			final List<SequenceD1a> result = new ArrayList<SequenceD1a>();
			final List<SwiftTagListBlock> bs = parentSequence.getSubBlocksDelimitedWithOptionalTail(SequenceD1a.START, SequenceD1a.END, SequenceD1a.TAIL); 
			if (bs != null && !bs.isEmpty()) {
				for (final SwiftTagListBlock s : bs) {
					result.add(new SequenceD1a(s));
				}
			}
			return result;
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 

// BaseSequenceCodeGenerator [seq=D1a1]
	/**
	* Class for Sequence "D1a1" of MT 341
	*/
	public static class SequenceD1a1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	        private SequenceD1a1() {
			super(new ArrayList<Tag>());
		}
		/**
		* Creates a sequence with the given content.
		* @see SwiftTagListBlock
		*/
		private SequenceD1a1(final SwiftTagListBlock content) {
			super(content.getTags());
		}
		/**
		* First mandatory tagname of the sequence: <em>"22P"  </em>.
		* Array format is for cases when more than one letter options is allowed
		*/
		public static final String[] START = { "22P"   } ;
		/**
		* Last mandatory tagname of the sequence: <em>"22R"  </em>
		* Array format is for cases when more than one letter options is allowed
		*/
		protected static final String[] END = { "22R"   };
		/**
		* List of optional tags after the last mandatory tag
		*/
		protected static final String[] TAIL = new String[]{  };

		/**
		* same as newInstance(0, 0, tags);
		* see #newInstance(Tag ... )
		*/
		@SequenceStyle(Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL)
		public static SequenceD1a1 newInstance(final Tag ... tags) {
			return newInstance(0, 0, tags);
		}
		@SequenceStyle(Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL)
		public static SequenceD1a1 newInstance(final int start, final int end, final Tag ... tags) {
			final SequenceD1a1 result = new SequenceD1a1();

			result.append(new Tag(START[start], ""));

			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}

			result.append(new Tag(END[end], ""));

			return result;
		}
	}
	/**
	* Get the list of SequenceD1a1 delimited by leading tag and end, with an optional tail.
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SwiftTagListBlock#getSubBlocksDelimitedWithOptionalTail(String[], String[], String[])
	*/
	@SequenceStyle(Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL)
	public List<SequenceD1a1> getSequenceD1a1List() {
		return getSequenceD1a1List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	
	/**
	* Get the list of SequenceD1a1 delimited by leading tag and end, with an optional tail.
	* The presence of this methods indicates that this sequence can occur more than once according to the Standard. 
	* If message is empty or nor sequences are found <em>an empty list</em> is returned.
	* @see SwiftTagListBlock#getSubBlocksDelimitedWithOptionalTail(String[], String[], String[])
	* @param parentSequence an optional parent sequence or <code>null</code> to find SequenceD1a1 within the complete message
	* @since 7.7
	*/
	@SequenceStyle(Type.GENERATED_FIXED_WITH_OPTIONAL_TAIL)
	public static List<SequenceD1a1> getSequenceD1a1List(final SwiftTagListBlock parentSequence) {
		if (parentSequence != null && !parentSequence.isEmpty()) {
			final List<SequenceD1a1> result = new ArrayList<SequenceD1a1>();
			final List<SwiftTagListBlock> bs = parentSequence.getSubBlocksDelimitedWithOptionalTail(SequenceD1a1.START, SequenceD1a1.END, SequenceD1a1.TAIL); 
			if (bs != null && !bs.isEmpty()) {
				for (final SwiftTagListBlock s : bs) {
					result.add(new SequenceD1a1(s));
				}
			}
			return result;
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();
	} 
 



}
