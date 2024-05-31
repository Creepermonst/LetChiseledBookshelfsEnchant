package net.tls.lcbe.config;

@io.wispforest.owo.config.annotation.Config(name = "lcbe-config", wrapperName = "Config")
public class Config {
	public Choices chiseledBookshelfType = Choices.ANY_BOOKSHELF;
	public int fillCount = 3;
	public boolean hasToBeEnchanted = false;

	public enum Choices {
		ANY_BOOKSHELF, FILLED_BOOKSHELF;
	}
}
