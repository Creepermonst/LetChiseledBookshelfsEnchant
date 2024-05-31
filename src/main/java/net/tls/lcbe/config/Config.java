package net.tls.lcbe.config;

import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RangeConstraint;

@io.wispforest.owo.config.annotation.Config(name = "lcbe-config", wrapperName = "Config")
@Modmenu(modId = "lcbe")
public class Config {
	@RangeConstraint(min = 1, max = 6)
	public int fillCount = 3;
	public boolean hasToBeEnchanted = false;
}
