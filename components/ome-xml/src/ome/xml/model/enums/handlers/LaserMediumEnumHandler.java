/*
 * ome.xml.model.enums.handlers.LaserMediumHandler
 *
 *-----------------------------------------------------------------------------
 *
 *  Copyright (C) 2005-@year@ Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee,
 *      University of Wisconsin-Madison
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *-----------------------------------------------------------------------------
 */

/*-----------------------------------------------------------------------------
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by melissa via xsd-fu on 2012-05-04 08:47:35-0400
 *
 *-----------------------------------------------------------------------------
 */

package ome.xml.model.enums.handlers;

import java.util.Hashtable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ome.xml.model.enums.Enumeration;
import ome.xml.model.enums.EnumerationException;
import ome.xml.model.enums.LaserMedium;

/**
 * Enumeration handler for LaserMedium.
 *
 * <dl><dt><b>Source code:</b></dt>
 * <dd><a href="http://trac.openmicroscopy.org.uk/ome/browser/bioformats.git/components/bio-formats/src/loci/formats/enums/handler/LaserMediumHandler.java">Trac</a>,
 * <a href="http://git.openmicroscopy.org/?p=bioformats.git;a=blob;f=components/bio-formats/src/loci/formats/enums/handler/LaserMediumHandler.java;hb=HEAD">Gitweb</a></dd></dl>
 */
public class LaserMediumEnumHandler implements IEnumerationHandler {

  // -- Constants --

  /** Logger for this class. */
  private static final Logger LOGGER =
    LoggerFactory.getLogger(LaserMediumEnumHandler.class);

  // -- Fields --

  /** Every LaserMedium value must match one of these patterns. */
  private static final Hashtable<String, String> patterns = makePatterns();

  private static Hashtable<String, String> makePatterns() {
    Hashtable<String, String> p = new Hashtable<String, String>();
    // BEGIN Schema enumeration mappings
    p.put("^\\s*Cu\\s*", "Cu");
    p.put("^\\s*Ag\\s*", "Ag");
    p.put("^\\s*ArFl\\s*", "ArFl");
    p.put("^\\s*ArCl\\s*", "ArCl");
    p.put("^\\s*KrFl\\s*", "KrFl");
    p.put("^\\s*KrCl\\s*", "KrCl");
    p.put("^\\s*XeFl\\s*", "XeFl");
    p.put("^\\s*XeCl\\s*", "XeCl");
    p.put("^\\s*XeBr\\s*", "XeBr");
    p.put("^\\s*N\\s*", "N");
    p.put("^\\s*Ar\\s*", "Ar");
    p.put("^\\s*Kr\\s*", "Kr");
    p.put("^\\s*Xe\\s*", "Xe");
    p.put("^\\s*HeNe\\s*", "HeNe");
    p.put("^\\s*HeCd\\s*", "HeCd");
    p.put("^\\s*CO\\s*", "CO");
    p.put("^\\s*CO2\\s*", "CO2");
    p.put("^\\s*H2O\\s*", "H2O");
    p.put("^\\s*HFl\\s*", "HFl");
    p.put("^\\s*NdGlass\\s*", "NdGlass");
    p.put("^\\s*NdYAG\\s*", "NdYAG");
    p.put("^\\s*ErGlass\\s*", "ErGlass");
    p.put("^\\s*ErYAG\\s*", "ErYAG");
    p.put("^\\s*HoYLF\\s*", "HoYLF");
    p.put("^\\s*HoYAG\\s*", "HoYAG");
    p.put("^\\s*Ruby\\s*", "Ruby");
    p.put("^\\s*TiSapphire\\s*", "TiSapphire");
    p.put("^\\s*Alexandrite\\s*", "Alexandrite");
    p.put("^\\s*Rhodamine6G\\s*", "Rhodamine6G");
    p.put("^\\s*CoumarinC30\\s*", "CoumarinC30");
    p.put("^\\s*GaAs\\s*", "GaAs");
    p.put("^\\s*GaAlAs\\s*", "GaAlAs");
    p.put("^\\s*EMinus\\s*", "EMinus");
    p.put("^\\s*Other\\s*", "Other");
    return p;
  }

  // -- IEnumerationHandler API methods --

  /* @see IEnumerationHandler#getEnumeration(String) */
  public Enumeration getEnumeration(String value)
    throws EnumerationException {
    if (value != null) {
      for (String pattern : patterns.keySet()) {
        if (value.toLowerCase().matches(pattern.toLowerCase())) {
          String v = patterns.get(pattern);
          return LaserMedium.fromString(v);
        }
      }
    }
    LOGGER.warn("Unknown {} value '{}' will be stored as \"Other\"",
      "LaserMedium", value);
    return LaserMedium.OTHER;
  }

  /* @see IEnumerationHandler#getEntity() */
  public Class<? extends Enumeration> getEntity() {
    return LaserMedium.class;
  }

}
