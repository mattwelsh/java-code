/*
 *  Copyright (C) 2019 by Matt Welsh
 *  This library is free software; you can redistribute it and/or modify it under the terms of the
 *  GNU Lesser General Public License as published by the Free Software Foundation; either version
 *  2.1 of the License, or any later version.
 *
 *  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details. You should have received a copy of the GNU
 *  Lesser General Public License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

package com.mattwelsh.astronomy.object.VSOP87;

import com.mattwelsh.astronomy.time.JulianDate;
import org.junit.Assert;
import org.junit.Test;

public class MercuryComputerTest {

  @Test
  public void TestRectangularCoords() {
    JulianDate jd = new JulianDate(2448724.5);
    MercuryComputer comp = new MercuryComputer(jd);
    Assert.assertEquals(comp.getRectX(), -0.23984495651508977, 0.00000000000000001);
    Assert.assertEquals(comp.getRectY(), -0.39281027329576385, 0.00000000000000001);
    Assert.assertEquals(comp.getRectZ(), -0.010065536794157885, 0.00000000000000001);
  }
}