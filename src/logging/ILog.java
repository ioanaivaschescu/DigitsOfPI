package logging;


public interface ILog {

	/**
	 * @param string
	 */
	void write(String string);

	/**
	 * @param value
	 */
	void write(long value);

	/**
	 * @param values
	 */
	public void write(Object... values);

	/**
	 *  @param value
	 * @param unit
     * @return
     */
	public String writeTime(long value, TimeUnit unit);

	/**
	 * @param string
	 * @param value
	 * @param unit
	 */
	public void writeTime(String string, long value, TimeUnit unit);

	public void close();

}
