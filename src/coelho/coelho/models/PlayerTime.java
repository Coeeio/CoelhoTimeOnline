package coelho.coelho.models;

public class PlayerTime {

	private String name;
	private Integer time;
	
	public PlayerTime(String name, Integer time) {
		this.name = name;
		this.time = time;
	}
	
	public String getTimeFormated() {
		StringBuilder string = new StringBuilder();
		
		Integer days = getTime() / 86400;
		Integer hours = getTime()  / 3600;
		Integer minutes = getTime()  / 60;
		Integer seconds = getTime()  % 60;
		
		if (days > 0) {
			string.append(days).append((days > 1) ? " dias" : " dia ");
		}
		if (hours > 0) {
			string.append(hours).append((hours > 1) ? " horas" : " hora ");
		}
		if (minutes > 0) {
			string.append(minutes).append((minutes > 1) ? " minutos" : " minuto ");
		}
		if (seconds > 0) {
			string.append(seconds).append((seconds > 1) ? " segundos" : " segundo");
		}
		return string.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}
	
	public void save() {
		
	}
}