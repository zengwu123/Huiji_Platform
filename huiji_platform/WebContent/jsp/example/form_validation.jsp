<%@ page language="java" pageEncoding="UTF-8"%>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#">Form elements</a> <a href="#" class="current">Validation</a> </div>
    <h1>Form validation</h1>
  </div>
  <div class="container-fluid"><hr>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-info-sign"></i> </span>
            <h5>Form validation</h5>
          </div>
          <div class="widget-content nopadding">
            <form class="form-horizontal" method="post" action="#" name="basic_validate" id="basic_validate" novalidate="novalidate">
              <div class="control-group">
                <label class="control-label">Your Name</label>
                <div class="controls">
                  <input type="text" name="required" id="required">
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Your Email</label>
                <div class="controls">
                  <input type="text" name="email" id="email">
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Date (only Number)</label>
                <div class="controls">
                  <input type="text" name="date" id="date">
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">URL (Start with http://)</label>
                <div class="controls">
                  <input type="text" name="url" id="url">
                </div>
              </div>
              <div class="form-actions">
                <input type="submit" value="Validate" class="btn btn-success">
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-info-sign"></i> </span>
            <h5>Numeric validation</h5>
          </div>
          <div class="widget-content nopadding">
            <form class="form-horizontal" method="post" action="#" name="number_validate" id="number_validate" novalidate="novalidate">
              <div class="control-group">
                <label class="control-label">Minimal Salary</label>
                <div class="controls">
                  <input type="text" name="min" id="min" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Maximum Salary</label>
                <div class="controls">
                  <input type="text" name="max" id="max" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">Only digit</label>
                <div class="controls">
                  <input type="text" name="number" id="number" />
                </div>
              </div>
              <div class="form-actions">
                <input type="submit" value="Validate" class="btn btn-success">
              </div>
            </form>
          </div>
        </div>
      </div>
      <div class="row-fluid">
        <div class="span12">
          <div class="widget-box">
            <div class="widget-title"> <span class="icon"> <i class="icon-info-sign"></i> </span>
              <h5>Security validation</h5>
            </div>
            <div class="widget-content nopadding">
              <form class="form-horizontal" method="post" action="#" name="password_validate" id="password_validate" novalidate="novalidate">
                <div class="control-group">
                  <label class="control-label">Password</label>
                  <div class="controls">
                    <input type="password" name="pwd" id="pwd" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label">Confirm password</label>
                  <div class="controls">
                    <input type="password" name="pwd2" id="pwd2" />
                  </div>
                </div>
                <div class="form-actions">
                  <input type="submit" value="Validate" class="btn btn-success">
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>