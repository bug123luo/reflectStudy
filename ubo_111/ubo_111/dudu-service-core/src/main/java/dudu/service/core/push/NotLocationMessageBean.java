/*
 * Copyright 2015 The Dudu Project
 *
 * The Dudu Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package dudu.service.core.push;

public class NotLocationMessageBean extends BasicMessageBean {


	/**
	 * 
	 */
	private static final long serialVersionUID = 4508730299653369324L;
	private String sensorId;
	private String position;
	private String t;

	public NotLocationMessageBean() {
		super.setType("notloc");
	}

	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}
}