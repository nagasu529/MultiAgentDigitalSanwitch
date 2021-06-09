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

package edu.cuny.cat.server;

import edu.cuny.util.ResourceFactory;

/**
 * A factory class for creating {@link SessionTimeoutTask}s.
 * 
 * @author Jinzhong Niu
 * @version $Revision: 1.5 $
 */

public class SessionTimeoutTaskFactory implements
		ResourceFactory<SessionTimeoutTask> {

	/**
	 * creates a {@link SessionTimeoutTask}.
	 * 
	 * @return the {@link SessionTimeoutTask} created.
	 */
	@Override
	public SessionTimeoutTask create() {
		return new SessionTimeoutTask();
	}
}