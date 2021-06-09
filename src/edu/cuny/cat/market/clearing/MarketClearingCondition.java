/*
 * JCAT - TAC Market Design Competition Platform
 * Copyright (C) 2006-2013 Jinzhong Niu, Kai Cai
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */
/*
 * JASA Java Auction Simulator API
 * Copyright (C) 2001-2005 Steve Phelps
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package edu.cuny.cat.market.clearing;

import edu.cuny.cat.market.AuctioneerPolicy;

/**
 * The interface for expressing the condition of clearing the current market.
 * Whenever, it's time to do so, <code>notifyObservers()</code> is called.
 * 
 * <p>
 * <b>Default Base</b>
 * </p>
 * <table>
 * <tr>
 * <td valign=top><tt>clearing</tt></td>
 * </tr>
 * </table>
 * 
 * @author Jinzhong Niu
 * @version $Revision: 1.14 $
 * 
 */

public class MarketClearingCondition extends AuctioneerPolicy {

	public static final String P_DEF_BASE = "clearing";

	/**
	 * notifies auctioneer to clear market.
	 */
	protected void triggerClearing() {
		auctioneer.clear();
	}
}