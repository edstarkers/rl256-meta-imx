require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.4.0.p2.4.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "next"
LOCALVERSION = "-1.0.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"

SRCREV = "b1bbb2aee9a2e03187ee4cadf403451c570874fe"